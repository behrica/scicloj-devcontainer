(ns py-r-test
  (:require  [clojure.test :as t]
             [libpython-clj2.python  :as py]
             [libpython-clj2.require :refer [require-python] ]
             [clojisr.v1.r :refer [require-r]]))

;; check if R and python bindings work
(py/initialize!)
(require-python '[os :as py-os])
(require-python '[pandas])
(require-r '[base])

(t/deftest test-python []
  (println :wd-python   
           (py-os/getcwd)))

(t/deftest test-R []
  (println :wd-R
           (r.base/getwd)))




