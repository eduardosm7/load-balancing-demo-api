(defproject demo-api "0.1.0-SNAPSHOT"
  :description "Simple hello world api"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [http-kit "2.3.0"]
                 [compojure "1.6.1"]
                 [org.clojure/data.json "0.2.6"]]
  :main demo-api.core)
