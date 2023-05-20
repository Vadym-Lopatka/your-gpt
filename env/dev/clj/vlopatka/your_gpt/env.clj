(ns vlopatka.your-gpt.env
  (:require
    [clojure.tools.logging :as log]
    [vlopatka.your-gpt.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init       (fn []
                 (log/info "\n-=[your-gpt starting using the development or test profile]=-"))
   :start      (fn []
                 (log/info "\n-=[your-gpt started successfully using the development or test profile]=-"))
   :stop       (fn []
                 (log/info "\n-=[your-gpt has shut down successfully]=-"))
   :middleware wrap-dev
   :opts       {:profile       :dev
                :persist-data? true}})
