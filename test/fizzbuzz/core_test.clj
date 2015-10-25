(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest fizzbuzz-test
  (testing "when FizzBuzz is passed a one it returns one"
    (is (= "1" (fizzbuzz 1))))

  (testing "when fizzbuzz is passed a two it returns two"
    (is (= "2" (fizzbuzz 2))))

  (testing "when fizzbuzz is passed a three it returns fizz"
    (is (= "fizz" (fizzbuzz 3))))

  (testing "when fizzbuzz is passed a five it returns buzz")
    (is (= "buzz" (fizzbuzz 5))))
