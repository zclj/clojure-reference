(ns user
  (:require
   [clojure.pprint]
   ;; refere to enable a 'reloaded workflow' in the REPL with integrant
   [integrant.repl :refer [clear go halt prep init reset reset-all]]))

(add-tap (bound-fn* clojure.pprint/pprint))

(defn dev-prep!
  "Preparing the dev environment consists of reading the system configration with the :dev profile and using this configuration to prepare integrant."
  []
  ;; set-prep! will store the system in integrant.repl.state/config
  (integrant.repl/set-prep!
   ;; set-prep! expects a zero arg fn that give the value of the
   ;; integrant configuration to use
   (fn [])))
