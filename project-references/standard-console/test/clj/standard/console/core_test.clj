(ns standard.console.core-test
  (:require [standard.console.core :as sut]
            [clojure.test :refer [deftest is]]))

(deftest should-say-hello
  (is (= "Hello, world"
         (sut/hello "world"))))
