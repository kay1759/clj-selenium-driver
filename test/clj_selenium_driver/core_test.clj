(ns clj-selenium-driver.core-test
  (:require
   [clj-selenium-driver.core :refer :all]
   [clojure.test :refer :all]))

(defn driver-fixture [f]
  (set-driver "http://selenium:4444/wd/hub" "firefox" "clj-selenium-driver")
  (f)
  (quit))

(use-fixtures :once driver-fixture)

(deftest hotel-testplanisphere-test
  (testing "website 'HOTEL PLANISPHERE'"
    (get-url "https://hotel.testplanisphere.dev/en-US/")
    (is (= (get-current-url)
           "https://hotel.testplanisphere.dev/en-US/"))

    (is (= (get-title)
           "HOTEL PLANISPHERE - Website for Practice Test Automation"))

    (is (= (subs (get-page-source) 0 19)
           "<html lang=\"en-US\">"))

    (is (= (get-inner-html
            (find-element :xpath
                          "/html/body/h1"))
           "Hotel Planisphere"))

    (is (= (get-inner-html
            (find-element :tag-name
                          "h1"))
           "Hotel Planisphere"))))

(load "core_action_test")
(load "core_navigate_test")
