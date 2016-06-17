(ns https-www-redirector.core
  (:refer-clojure :exclude [resolve])
  (:use clojurewerkz.urly.core)
  (:import [java.net URI URL]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn ensure-valid-url
  "Transform url format"
  [url]
  (let [u (url-like url)]
  (str (.withWww (.mutateProtocol u "https")))))
