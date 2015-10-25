(ns fizzbuzz.core)

(defn fizzbuzz
  [number]
  (if (= 0 (mod number 3))
    (str "fizz")
    (if (= 0 (mod number 5))
        (str "buzz")
        (str number))))
