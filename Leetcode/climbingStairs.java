class Solution {
    public int climbStairs(int n) {
        int a[] = new int[n+1];
        a[0] = 1; //1 way to climb 0 stairs -- don't climb
        a[1] = 1;
        for( int i=2; i<=n; i++){
            a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }
}
