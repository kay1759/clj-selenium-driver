(deftest action-test
  (testing "selenium action"
    (get-url "https://hotel.testplanisphere.dev/en-US/")

    (click
     (find-element :xpath "/html/body/nav/div/ul/li[3]/a"))

    (is (= (get-current-url)
           "https://hotel.testplanisphere.dev/en-US/signup.html"))

    (let [name-field (find-element :id "username")]

      (is (= (get-value name-field)
             ""))

      (send-keys name-field "John Smith")

      (is (= (get-value name-field)
             "John Smith")))

    (let [rank-field (find-element :name "rank")
          rank-normal (find-element :id "rank-normal")
          rank-premium (find-element :id "rank-premium")]

      (is (= (get-value rank-field)
             "premium"))

      (is (= (checked? rank-normal)
             false))

      (is (= (checked? rank-premium)
             true))

      (click rank-normal)

      (is (= (checked? rank-normal)
             true))

      (is (= (checked? rank-premium)
             false))

      (is (= (get-value rank-field)
             "premium")))

    (let [gender (find-element :id "gender")]

      (is (= (get-value gender)
             "0"))

      (select-by-index gender 1)

      (is (= (get-value gender)
             "1"))

      (select-by-visible-text gender "female")

      (is (= (get-value gender)
             "2")))

    (let [notification (find-element :id "notification")]

      (is (= (checked? notification)
             false))

      (click notification)

      (is (= (checked? notification)
             true)))))
