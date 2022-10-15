# Introduction to clj-selenium-driver

## Usage
### Example
```
(require '[clj-selenium-driver.core :as sd])

(sd/set-driver "http://selenium:4444/wd/hub" "chrome" "clj-selenium-driver")

(try
  (sd/get-url "http://localhost/")
  (let [element (sd/find-element :xpath "//div[@id='main']")
        content (sd/get-inner-html element)]
    (println content))
  (catch Exception e
    (println (str "caught exception: " (.toString e))))
  (finally
    (sd/quit)))
```

### API
- (set-driver &lt;selenium-server&gt; &lt;brower-name&gt; &lt;driver-name&gt;)
- (close)
- (quit)


- (get-url &lt;url&gt;)
- (get-current-url)
- (get-title)
- (get-page-source)
- (get-window-handle)
- (get-window-handles)
- (navigate)


- (by &lt;locator&gt; &lt;location descripter&gt;)
  - valid locator -> :id, :name, :class-name, :tag-name, :xpath, :css-selector, :link-text, :partical-link-text


- (back)
- (forward)
- (refresh)
- (to &lt;url&gt;)


- (find-element &lt;element&gt;)
- (find-element &lt;locator&gt; &lt;location descripter&gt;)
- (find-elements &lt;element&gt;)
- (find-elements &lt;locator&gt; &lt;location descripter&gt;)
- (get-attribute &lt;element&gt; &lt;attibute-name&gt;)
- (get-text &lt;element&gt;)
- (get-value &lt;element&gt;)
- (get-inner-html &lt;element&gt;)
  - element is a return value of (by &lt;locator&gt; &lt;location descripter&gt;)


- (click &lt;element&gt;)
- (checked? &lt;element&gt;)
- (send-keys &lt;element&gt; &lt;input text&gt;)
- (send-return &lt;element&gt;)
- (select-by-index &lt;element&gt; &lt;index number&gt;)
- (select-by-visible-text &lt;element&gt; &lt;text&gt;)

