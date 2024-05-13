#!/bin/bash -x
which clojure
which clj
clj -e "(+ 1 1)"
clj -X:test
