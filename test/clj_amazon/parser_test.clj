(ns clj-amazon.parser-test
  (:require [clj-amazon
             [fixture :refer [item-lookup-response item-search-response]]
             [parser :refer :all]]
            [clojure.test :refer :all]))

(deftest test-parse-item-search-response
  (let [result (parse item-search-response)]
    (is (= (-> result keys sort) [:items :total-pages :total-results]))
    (is (= 2 (-> result :items count)))))

(deftest test-parse-item-lookup-response
  (let [result (parse item-lookup-response)]
    (is (= (-> result keys) [:items]))
    (is (= 2 (-> result :items count)))))
