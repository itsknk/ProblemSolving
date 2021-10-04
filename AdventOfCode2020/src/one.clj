(ns adc.one
  (:require
   [clojure.math.combinatorics :as comb]
   [clojure.string :as str]))


;; The Elves in accounting just need you to fix your expense report (your puzzle input); apparently, something isn't quite adding up.
;; Specifically, they need you to find the two entries that sum to 2020 and then multiply those two numbers together.
;; For example, suppose your expense report contained the following:
;; 1721
;; 979
;; 366
;; 299
;; 675
;; 1456
;; In this list, the two entries that sum to 2020 are 1721 and 299. Multiplying them together produces 1721 * 299 = 514579, so the correct answer is 514579.


(def input-data
  (map read-string (str/split-lines (slurp "resources/input.txt"))))


(defn solution [itr input-data]
  (->> (comb/combinations input-data itr)
       (filter #(= (apply + %) 2020))
       first
       (apply *)))

;; Part One -> (solution 2 input-data) = 440979
;; Part Two -> (solution 3 input-data) = 82498112
