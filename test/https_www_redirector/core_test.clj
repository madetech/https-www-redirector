(ns https-www-redirector.core-test
  (:require [clojure.test :refer :all]
            [https-www-redirector.core :refer :all]))

(deftest prepend-https-and-www
  (testing "Transform non https, non www urls to include these"
    (is (= (ensure-valid-url "www.google.com") "https://www.google.com"))))

(deftest dont-change-a-valid-url
  (testing "Transform non https, non www urls to include these"
    (is (= (ensure-valid-url "https://www.google.com") "https://www.google.com"))))
