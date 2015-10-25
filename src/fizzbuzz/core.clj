(ns fizzbuzz.core)

(defn fizzbuzz
  [number]
  (if (= 3 number)
    (str "fizz")
    (if (= 5 number)
        (str "buzz")
        (str number))))
