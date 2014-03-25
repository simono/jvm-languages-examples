(defmacro dbg [body]
  `(let [x# ~body]
     (println "dbg:" '~body "=" x#)
     x#))

(dbg (+ 1 2))
(println (macroexpand-1 '(dbg (+ 1 2))))
