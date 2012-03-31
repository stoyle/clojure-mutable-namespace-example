(ns clojure-aot-example.core
  (:gen-class))

(def foo "foo")

(def foo "bar")  

(do
  (def foo "baz")
  (println "creating baz"))
  

(defn -main [& args]
  (println foo)
  (def foo (read-line))
  (println foo))
