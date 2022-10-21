class Solution:
    def longestValidParentheses(self, s: str) -> int:
        if (s == "" or len(s) == 0):
            return 0
        
        a = 0
        b = 0
        maxi = 0
        for i in range(0,len(s)-1):
            if(s[i] == '('):
                a = a + 1
            else:
                b = b + 1
            if(a == b):
                maxi = max(maxi, a+b)
            elif(b > a):
                a = 0
                b = 0
        a = 0
        b = 0
        j = len(s) - 1
        while (j >= 0):
            if(s[j] == ')'):
                b = b + 1
            else:
                a = a + 1
            if(a == b):
                maxi = max(maxi, a+b)
            elif(a > b):
                a = 0
                b = 0
            j = j - 1
        return maxi
