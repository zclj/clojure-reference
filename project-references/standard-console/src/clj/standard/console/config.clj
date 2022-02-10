(ns standard.console.config
  (:require [aero.core :as aero]
            [clojure.java.io]
            [clojure.tools.logging :as log]
            [integrant.core :as ig]))

(defmethod aero/reader 'ig/ref
  [_ _ value]
  (ig/ref value))

(defmethod aero/reader 'ig/refset
  [_ _ value]
  (ig/refset value))


