(ns demo-api.core
  (:require [org.httpkit.server :as server])
  (:require [compojure.core :as compojure])
  (:require [clojure.data.json :as json]))

(def counter (atom 1))

(def uuid (.toString (java.util.UUID/randomUUID)))

(compojure/defroutes app
  (compojure/GET 
    "/" 
    [] 
    (println "Server was hit" @counter "times")
    (swap! counter inc)
    {:status 200
     :headers {"Content-Type" "application/json"}
     :body (json/write-str {:demo "api"
                            :server_uuid uuid})}))

(defn -main
  []
  (let [port (Integer/parseInt (or (System/getenv "PORT") "8080"))]
    (server/run-server app {:port port})
    (println (str "Listening on port " port))))
