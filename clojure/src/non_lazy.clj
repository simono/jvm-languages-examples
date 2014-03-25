(defn double-from [n]
  (cons (* n 2) (double-from (inc n))))

(println (take 4 (double-from 4)))
