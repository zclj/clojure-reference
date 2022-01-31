(ns standard.console.core
  (:require [clojure.tools.logging :as log]))

(defn hello
  [s]
  (log/info "Hi INFO")
  (log/debug "Hi DEBUG")
  (str "Hello, " s))

(defn do-log
  []
  (log/info "Logged")
  (log/debug "Hi dev")
  (tap> {:do-log {:interesting :stuff}}))
