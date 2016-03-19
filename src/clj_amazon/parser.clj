(ns clj-amazon.parser
  (:require [clojure.zip :as zip]))

(defn- normalize-tag-name-key
  [name-key]
  (let [s (name name-key)]
    (-> (clojure.string/replace s #"([A-Z]+)" "-$1")
        clojure.string/lower-case
        (subs 1)
        keyword)))

(defn- tags?
  [content]
  (if (-> content first :tag)
    true
    false))

(defn- same-tags?
  [content]
  (if (and (tags? content)
           (= 1 (-> (map :tag content) distinct count)))
    true
    false))

(defn- find-tags
  [name-key content]
  (filter #(= (:tag %) name-key) content))

(defn- find-tag
  [name-key content]
  (first (find-tags name-key content)))

(defn- parse-item-param
  [tag]
  (let [k (-> tag :tag normalize-tag-name-key)
        v (cond
            (same-tags? (:content tag))
            (mapv #(-> % parse-item-param vals first) (:content tag))
            
            (tags? (:content tag))
            (apply merge (mapv parse-item-param (:content tag)))

            :else
            (-> tag :content first))]
    (hash-map k v)))

(defn parse-item
  [item-tag]
  (let [tags (-> item-tag :content)]
    (apply merge (map parse-item-param tags))))

(defn- parse-items
  [items-tag]
  (let [item-tags (find-tags :Item (:content items-tag))]
    (mapv parse-item item-tags)))

(defn- parse-total-results
  [total-results-tag]
  (-> total-results-tag :content first))

(defn- parse-total-pages
  [total-pages-tag]
  (-> total-pages-tag :content first))


(defn tag-content?
  [content]
  (and (map? content)
       (contains? content :tag)))

(defn- parse-content
  [content]
  (cond
    (tag-content? content)
    (hash-map (-> content :tag normalize-tag-name-key)
              (parse-content (:content content)))

    (and (vector? content) (= 1 (count content)))
    (parse-content (first content))
    
    (and (vector? content) (same-tags? content))
    (mapv #(-> % vals first) (mapv parse-content content))
    
    (vector? content)    
    (apply merge (mapv parse-content content))
    
    (string? content) content))

(defmulti parse (fn [response] (:tag response)))

(defmethod parse :ItemSearchResponse
  [response]
  (let [items-tag (find-tag :Items (:content response))
        total-results-tag (find-tag :TotalResults (:content items-tag))
        total-pages-tag (find-tag :TotalPages (:content items-tag))]
    {:total-results (parse-total-results total-results-tag)
     :total-pages (parse-total-pages total-pages-tag)
     :items (parse-items items-tag)}))

(defmethod parse :ItemLookupResponse
  [response]
  (let [items-tag (find-tag :Items (:content response))]
    {:items (parse-items items-tag)}))

(defn- loc->tag
  [loc]
  (-> loc zip/node :tag))

(defn- find-first-loc
  "Finds the first location in the hierarchy that matches a predicate 
   by depth-first and moving next location."
  [loc pred]
  (loop [loc loc]
    (when-not (zip/end? loc)
      (if (pred loc)
        loc
        (recur (zip/next loc))))))

(defn- find-first-loc-backward
  "Finds the first location in the hierarchy that matches a predicate 
   by depth-first and moving previous location."
  [loc pred]
  (loop [loc loc]
    (when loc
      (if (pred loc)
        loc
        (recur (zip/prev loc))))))

(defn- remove-first-loc
  [loc pred]
  "Removes the first location in the hierarchy that matches a predicate
   by depth-first and moving next location. Returns this loc after removing."
  (if-let [finded (find-first-loc loc pred)]
    (-> finded
        zip/remove
        (find-first-loc-backward #(= (loc->tag %) (loc->tag loc))))
    (throw (Exception. "can not find the remove location"))))

(defmethod parse :BrowseNodeLookupResponse
  [response]
  (-> response
      zip/xml-zip
      (remove-first-loc #(= (loc->tag %) :OperationRequest))
      (remove-first-loc #(= (loc->tag %) :Request))
      zip/root
      parse-content
      :browse-node-lookup-response))

(defmethod parse :default
  [response]
  (throw (ex-info "Can not parse response"
                  {:response response})))
