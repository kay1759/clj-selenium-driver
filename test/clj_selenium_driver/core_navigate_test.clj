(deftest navigate-test
  (testing "selenium navigation"
    (get-url "https://hotel.testplanisphere.dev/en-US/")
    (is (= (get-current-url)
           "https://hotel.testplanisphere.dev/en-US/"))

    (to "https://www.google.com/")
    (is (= (get-current-url)
           "https://www.google.com/"))

    (back)
    (is (= (get-current-url)
           "https://hotel.testplanisphere.dev/en-US/"))

    (forward)
    (is (= (get-current-url)
           "https://www.google.com/"))))

