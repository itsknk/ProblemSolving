# Loop through odd digits then do the replacement there. 
class Solution:
    def replaceDigits(self, s: str) -> str:
        alpha = "abcdefghijklmnopqrstuvwxyz"
        ans = ""
        for i in range(1, len(s), 2):
            s = s[:i] + alpha[alpha.index(s[i - 1]) + int(s[i])] + s[i + 1:]
        return s

# Implement what's asked. As clear as it can get.
class Solution:
    def replaceDigits(self, s: str) -> str:
        s = list(s)

        def shift(c, x):
            alphabet = 'abcdefghijklmnopqrstuvwxyz'
            index = alphabet.index(c)
            return alphabet[index + x]

        for i in range(1, len(s), 2):
            s[i] = shift(s[i - 1], int(s[i]))

        return ''.join(s)
