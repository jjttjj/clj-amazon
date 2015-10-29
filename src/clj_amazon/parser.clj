(ns clj-amazon.parser
  (:require [clojure.string :as cstr]))

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

(defmethod parse :default
  [response]
  (throw (ex-info "Can not parse response"
                  {:response response})))
