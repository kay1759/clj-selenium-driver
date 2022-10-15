(in-ns 'clj-selenium-driver.core)

(require '[clj-selenium-driver.core :refer [navigate]])

(defn back
  "Go back to the previous page in \"browsing history\""
  []
  (.back (navigate)))

(defn forward
  "Go forward to the next page in \"browsing history\"."
  []
  (.forward (navigate)))

(defn refresh
  "Refresh the current page"
  []
  (.refresh (navigate)))

(defn to
  "Navigate to a particular URL. Arg `url` can be either String or java.net.URL. Equivalent to the `get` function, provided here for com"
  [url]
  (.to (navigate) url))
