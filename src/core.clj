(ns core
  (:gen-class))

(def foo "foo")
(println (str "First value of foo " foo))

(def foo "bar")  
(println (str "Second value of foo " foo))

(do
  (println "Creating new foo (baz) inside of do")
  (def foo "baz")
  (println (str "Third value of foo " foo)))
  
(alter-var-root #'foo (fn [el] "altered"))
(println "Foo after alter-var-root" foo)

(defn -main [& args]
  (println "Input new value for foo")
  (def foo (read-line))
  (println (str "Foos value from read-line " foo)))

