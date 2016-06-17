(ns https-www-redirector.core-test
  (:require [clojure.test :refer :all]
            [https-www-redirector.core :refer :all]))

(deftest ensure-valid-url-test
  (testing "Transform non https, non www urls to include these"
    (is (= (eval ensure-valid-url) "foo"))))
