# Add elements if not there. If there, then clear them and increment count i.e, consider this a partition. 
class Solution:
    def partitionString(self, s: str) -> int:
        ans = set()
        count = 1
        for i in s:
            if i in ans:
                ans.clear()
                count = count + 1
            ans.add(i)

        return count
