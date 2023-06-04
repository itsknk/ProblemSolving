# Check each letter if it's not there in allowed and make count. Then minus count from overall count of words.
class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        allowed = set(allowed)
        print("ALLOWED", allowed)
        count = 0
        for i in words:
            for j in i:
                if j not in allowed:
                    print("J NOT", j)
                    count = count+1
                    print("AFTER COUNT", count)
                    break
        return len(words)-count

# Superset or Equal
class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
           #Superset or equal
           return sum(set(allowed)>=set(i) for i in words)
