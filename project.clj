(defproject https-www-redirector "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 [ring "1.5.0"]
                 [ring/ring-jetty-adapter "1.5.0"]
                 [compojure "1.5.1"]
                 [clojurewerkz/urly "2.0.0-alpha5"]
                ]
  :main ^:skip-aot https-www-redirector.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
