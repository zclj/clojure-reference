(ns user
  (:require
   [clojure.pprint]
   ;; refere to enable a 'reloaded workflow' in the REPL with integrant
   [integrant.repl :refer [clear go halt prep init reset reset-all]]))

(add-tap (bound-fn* clojure.pprint/pprint))
