(ns standard.console.env
  (:require
   [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[ starting using the development profile]=-"))
   :started
   (fn []
     (log/info "\n-=[ started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[ has shut down successfully]=-"))
   :opts {:profile :dev}})
