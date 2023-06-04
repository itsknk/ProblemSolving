# Slice strings in array from 0 to length of prefix and see if it matches.
class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        count = 0
        pr = [pr[0:len(pref)] for pr in words]
        for i in pr:
            if i == pref:
                count = count+1
        return count

# Check if prefix is in i and if the index of prefix is at 0.
class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        count=0
        for i in words:
            if pref in i and i.index(pref)==0:
                count+=1
        return count
