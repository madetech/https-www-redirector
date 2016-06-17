(ns https-www-redirector.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn ensure-valid-url
  "Transform url format"
  [url]
  (if (re-find #"https://" url) url (str "https://" url)))
