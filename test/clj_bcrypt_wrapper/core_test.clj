(ns clj-bcrypt-wrapper.core-test
  (:use clojure.test
        clj-bcrypt-wrapper.core))

(deftest compare-hashed-to-plain
  (testing "Ensure a hashed password is equal to itself."
    (is (= true (check-password "1234567890" (encrypt "1234567890"))))))
