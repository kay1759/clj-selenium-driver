(defproject org.clojars.kay1759/clj-selenium-driver "0.1.1"
  :description "library for controlling selenium"
  :url "https://github.com/kay1759/clj-selenium-driver"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.seleniumhq.selenium/selenium-server "3.141.59"]
                 [org.seleniumhq.selenium/selenium-java "3.141.59"]
                 [org.seleniumhq.selenium/selenium-remote-driver "3.141.59"]]
  :repl-options {:init-ns clj-selenium-driver.core})
