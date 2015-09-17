(ns visual-timer.app
  (:require [visual-timer.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
