(ns fizzbuzz.core)

(defn fizzbuzz
  [number]
  (if (= 3 number)
    (str "fizz")
    (str number)))
