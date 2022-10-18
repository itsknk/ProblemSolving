class Solution:
    def myPow(self, x: float, n: int) -> float:
        c = 1 #power element
        fc = float(c)
        if(n < 0):
            n = -n
            x = 1 / x
        while(n!=0):
            if(n%2!=0):
                fc = fc * x
            x = x * x
            n = n >> 1
        return fc
