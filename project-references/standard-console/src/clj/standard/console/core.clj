(ns standard.console.core
  (:require [clojure.tools.logging :as log]))

(defn hello
  [s]
  (str "Hello, " s))

(defn do-log
  []
  (log/info "Logged")
  (log/debug "Hi dev")
  (tap> {:do-log {:interesting :stuff}}))
