(ns https-www-redirector.core-test
  (:require [clojure.test :refer :all]
            [https-www-redirector.core :refer :all]))

(deftest prepend-https-and-www
  (testing "Prepend https and www"
    (is (= (ensure-valid-url "google.com") "https://www.google.com/")))

  (testing "Leaves original untouched (er trailing forward slash)"
    (is (= (ensure-valid-url "https://www.google.com") "https://www.google.com/")))

  (testing "Adds www"
    (is (= (ensure-valid-url "https://google.com") "https://www.google.com/")))

  (testing "Preserves url path segments without trailing slash"
    (is (= (ensure-valid-url "https://google.com/foo/bar") "https://www.google.com/foo/bar")))

  (testing "Preserves url path segments with trailing slash"
    (is (= (ensure-valid-url "https://google.com/foo/bar/") "https://www.google.com/foo/bar/")))
