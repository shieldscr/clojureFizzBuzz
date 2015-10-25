(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest fizzbuzz-test
  (testing "when FizzBuzz is passed a one it returns one"
    (is (= "1" (fizzbuzz 1))))

  (testing "when fizzbuzz is passed a two it returns two"
    (is (= "2" (fizzbuzz 2)))))