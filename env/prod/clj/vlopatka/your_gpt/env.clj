(ns vlopatka.your-gpt.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init       (fn []
                 (log/info "\n-=[your-gpt starting]=-"))
   :start      (fn []
                 (log/info "\n-=[your-gpt started successfully]=-"))
   :stop       (fn []
                 (log/info "\n-=[your-gpt has shut down successfully]=-"))
   :middleware (fn [handler _] handler)
   :opts       {:profile :prod}})
