# Throw sources and Destinations in 2 separate sets. See which one is unique in B.
class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        a = set()
        b = set()
        for i in paths:
            a.add(i[0])
            b.add(i[1])

        for i in b:
            if i not in a:
                return i
