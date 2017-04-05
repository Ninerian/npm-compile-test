(ns npm-compile-test.core
  (:require autobahn))

(defn- main
  "I don't do a whole lot."
  []
  (autobahn/version))
