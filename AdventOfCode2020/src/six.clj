(ns adc.six
  (:require
   [clojure.string :as str]
   [clojure.set :as set]))


;; Part One
;; Each group's answers are separated by a blank line, and within each group, each person's answers are on a single line. For example:
;; abc
;; a
;; b
;; c
;; ab
;; ac
;; a
;; a
;; a
;; a
;; b
;; This list represents answers from five groups:
;; The first group contains one person who answered "yes" to 3 questions: a, b, and c.
;; The second group contains three people; combined, they answered "yes" to 3 questions: a, b, and c.
;; The third group contains two people; combined, they answered "yes" to 3 questions: a, b, and c.
;; The fourth group contains four people; combined, they answered "yes" to only 1 question, a.
;; The last group contains one person who answered "yes" to only 1 question, b.
;; In this example, the sum of these counts is 3 + 3 + 3 + 1 + 1 = 11.
;; For each group, count the number of questions to which anyone answered "yes". What is the sum of those counts?


(def input-data
  (str/split (slurp "resources/inputsix.txt") #"\n\n"))


(defn solve-group
  [combine group]
  (->> (str/split-lines group)
       (map set)
       (apply combine)
       count))


(defn solution-one
  [input-data]
  (apply + (map #(solve-group set/union %) input-data)))


;; Part One -> (solution-one input-data) = 6542


;; Part Two
;; As you finish the last group's customs declaration, you notice that you misread one word in the instructions:
;; You don't need to identify the questions to which anyone answered "yes"; you need to identify the questions to which everyone answered "yes"!
;; Using the same example as above:
;; abc
;; a
;; b
;; c
;; ab
;; ac
;; a
;; a
;; a
;; a
;; b
;; This list represents answers from five groups:
;; In the first group, everyone (all 1 person) answered "yes" to 3 questions: a, b, and c.
;; In the second group, there is no question to which everyone answered "yes".
;; In the third group, everyone answered yes to only 1 question, a. Since some people did not answer "yes" to b or c, they don't count.
;; In the fourth group, everyone answered yes to only 1 question, a.
;; In the fifth group, everyone (all 1 person) answered "yes" to 1 question, b.
;; In this example, the sum of these counts is 3 + 0 + 1 + 1 + 1 = 6.
;; For each group, count the number of questions to which everyone answered "yes". What is the sum of those counts?


(defn solution-two
  [input-data]
  (apply + (map #(solve-group set/intersection %) input-data)))


;; Part Two -> (solution-two input-data) = 3299
