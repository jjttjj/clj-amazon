(ns clj-amazon.parser-test
  (:require [clj-amazon.fixture
             [browse-node-lookup :as bnl]
             [item-lookup :as il]
             [item-search :as is]]
            [clj-amazon.parser :refer :all]
            [clojure.test :refer :all]))

(deftest test-parse-item-search-response
  (let [result (parse is/response)]
    (is (= (-> result keys sort) [:items :total-pages :total-results]))
    (is (= 2 (-> result :items count)))))

(deftest test-parse-item-lookup-response
  (let [result (parse il/response)]
    (is (= (-> result keys) [:items]))
    (is (= 2 (-> result :items count)))))

(deftest test-parse-browse-node-lookup-response
  (let [result (parse bnl/response)]
    (is (= (-> result keys sort) [:browse-node :request]))))
