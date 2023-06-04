# Add to dictionary and check their count. 
class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        ansd = {}
        for i in s:
            if  i in ansd:
                ansd[i] = ansd[i] + 1
            else:
                ansd[i] = 1
        values = set(ansd.values())
        return len(values) == 1

