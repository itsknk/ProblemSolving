# Start at 3rd from back, jump 3 places. Insert . at each till the number ends.
class Solution:
    def thousandSeparator(self, n: int) -> str:
        if n >= 1000:
            ans = list(str(n))
            for i in range(len(ans)-3, 0, -3):
                ans.insert(i,".")
            return "".join(ans)
        else:
            return str(n)
