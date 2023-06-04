# Create a set. Add stuff to it and see it it's there in it. 
class Solution:
    def repeatedCharacter(self, s: str) -> str:
        dup = set()
        for i in s:
            if i in dup:
                return i
            dup.add(i)
