# Stack.
class Solution:
    def minLength(self, s: str) -> int:
        ans = []
        for i in s:
            if len(ans)>0 and (ans[-1] == 'A' and i == 'B' or ans[-1] == 'C' and i == 'D'):
                ans.pop()
            else:
                ans.append(i)
        return len(ans)
