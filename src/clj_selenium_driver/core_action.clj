(in-ns 'clj-selenium-driver.core)

(import org.openqa.selenium.Keys)
(import org.openqa.selenium.support.ui.Select)

(require '[clj-selenium-driver.core :refer [driver]])

(defn find-element
  "Find the first WebElement using the given method."
  ([element]
   (.findElement @driver element))
  ([locator arg]
   (.findElement @driver (by locator arg))))

(defn find-elements
  "Find all elements within the current page using the given mechanism. "
  ([element]
   (.findElements @driver element))
  ([locator arg]
   (.findElements @driver (by locator arg))))

(defn get-attribute
  "Get attribute"
  [element attibute-name]
  (.getAttribute element attibute-name))

(defn get-text
  "Get text"
  [element]
  (.getText element))

(defn get-value
  "Get attribute 'value'"
  [element]
  (get-attribute element "value"))

(defn get-inner-html
  "Get attribute 'innerHTML'"
  [element]
  (get-attribute element "innerHTML"))

(defn checked?
  "Is attribute 'checked' set?"
  [element]
  (= "true"
     (get-attribute element "checked")))

(defn send-keys
  "Input text to text field or text area"
  [element text]
  (.sendKeys element (into-array [text])))

(defn send-return
  "Input 'RETRUN' to text field or text area"
  [element]
  (send-keys element Keys/RETURN))

(defn click
  "Click element"
  [element]
  (.click element))

(defn select-by-index
  "Select by index"
  [element idx]
  (let [selectbox (Select. element)]
    (.selectByIndex selectbox idx)))

(defn select-by-visible-text
  "Select by visible text"
  [element text]
  (let [selectbox (Select. element)]
    (.selectByVisibleText selectbox text)))

