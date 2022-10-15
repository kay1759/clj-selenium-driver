(in-ns 'clj-selenium-driver.core)

(import org.openqa.selenium.By)

;;;
;;; find elements?, get attribute pr text
;;;
(defn id
  "Get object by 'id'"
  [arg]
  (By/id arg))

(defn by-name
  "Get element by 'name'"
  [arg]
  (By/name arg))

(defn class-name
  "Get element by 'class name'"
  [arg]
  (By/className arg))

(defn tag-name
  "Get element from 'tag name'"
  [arg]
  (By/tagName arg))

(defn link-text
  "Get element from 'link text'"
  [arg]
  (By/linkText arg))

(defn partial-link-text
  "Get element from 'partial link text'"
  [arg]
  (By/partialLinkText arg))

(defn xpath
  "Get element from 'xpath'"
  [arg]
  (By/xpath arg))

(defn css-selector
  "Get element from 'css selector'"
  [arg]
  (By/cssSelector arg))

(defmulti by
  "Get element"
  (fn [locator arg] locator))

(defmethod by :id
  [locator arg]
  (id arg))

(defmethod by :name
  [locator arg]
  (by-name arg))

(defmethod by :class-name
  [locator arg]
  (class-name arg))

(defmethod by :tag-name
  [locator arg]
  (tag-name arg))

(defmethod by :link-text
  [locator arg]
  (link-text arg))

(defmethod by :partial-link-text
  [locator arg]
  (partial-link-text arg))

(defmethod by :xpath
  [locator arg]
  (xpath arg))

(defmethod by :css-selector
  [locator arg]
  (css-selector arg))
