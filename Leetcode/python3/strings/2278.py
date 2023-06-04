# Count and do the rest.
class Solution:
    def percentageLetter(self, s: str, letter: str) -> int:
        if letter not in s:
            return 0
        count = 0
        for i in s:
            if i == letter:
                count = count +1
        return math.floor((count/len(s))*100)
