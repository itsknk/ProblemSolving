# Split by bar then consider only even location data and count * there.
class Solution:
    def countAsterisks(self, s: str) -> int:
        a = s.split("|")
        count = 0
        for i,j in enumerate(a):
            if i%2 == 0:
                count = count + j.count("*")
        return count
