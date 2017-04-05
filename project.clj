(defproject npm-compile-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-cljsbuild "1.0.6"]]
  :dependencies [[cljsjs/autobahnjs "0.9.9-0"]]
  :source-paths ["src"]
  :cljsbuild {:builds
              [{:source-paths  ["src"]
                :id            :client
                :compiler      {:output-to  "resources/autobahn_cljs.js"
                                :output-dir "build"
                                :externs    ["process.js"]
                                :npm-deps   {:autobahn "0.9.9"}}
                :optimizations :advanced}]}
  :profiles {:dev
             {:dependencies [[org.clojure/clojure "1.8.0"]
                             [org.clojure/clojurescript "1.9.513"]
                             [org.clojure/core.async "0.2.374"]]}})
