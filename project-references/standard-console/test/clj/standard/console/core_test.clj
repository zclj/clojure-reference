(ns standard.console.core-test
  (:require [standard.console.core :as sut]
            [clojure.test :as t]))

(deftest should-say-hello
  (is (= "Hello, world"
         (sut/hello "world"))))
