(ns clj-selenium-driver.core
  (:import
   java.net.URL
   org.openqa.selenium.Platform
   [org.openqa.selenium.remote CapabilityType DesiredCapabilities RemoteWebDriver]))

(def driver (atom nil))

(defn set-driver
  "Set the selenium driver"
  [selenium-server brower-name driver-name]
  (let [caps (doto (DesiredCapabilities.)
               (.setCapability CapabilityType/BROWSER_NAME brower-name)
               (.setCapability CapabilityType/PLATFORM Platform/LINUX)
               (.setCapability "name" driver-name))
        wd (RemoteWebDriver. (URL. selenium-server) caps)
        session-id (str (.getSessionId wd))]
    (reset! driver wd)))

(defn get-url
  "Load a new web page in the current browser window. "
  [url]
  (.get @driver url))

(defn get-current-url
  "Get a string representing the current URL that the browser is looking at."
  []
  (.getCurrentUrl @driver))

(defn get-title
  "Get the title of the current page."
  []
  (.getTitle @driver))

(defn get-page-source
  "Get the source of the last loaded page. "
  []
  (.getPageSource @driver))

(defn manage
  "Close the current window, quitting the browser if it's the last window currently open."
  []
  (.manage @driver))

(defn switch-to
  "Close the current window, quitting the browser if it's the last window currently open."
  []
  (.switchTo @driver))

(defn close
  "Close the current window, quitting the browser if it's the last window currently open."
  []
  (.close @driver))

(defn quit
  "Quits this driver, closing every associated window."
  []
  (.quit @driver)
  (reset! driver nil))

(defn get-window-handle
  "Return an opaque handle to this window that uniquely identifies it within this driver instance. "
  []
  (.getWindowHandle @driver))

(defn get-window-handles
  "Return an opaque handle to this window that uniquely identifies it within this driver instance. "
  []
  (.getWindowHandles @driver))

(defn navigate
  "Return an opaque handle to this window that uniquely identifies it within this driver instance. "
  []
  (.navigate @driver))

(load "core_by")
(load "core_navigate")
(load "core_action")
