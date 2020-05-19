class shortestDistToChar {
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] ans = new int[n];
        int pos = -n;
        for(int i=0; i<n; i++){
            if(S.charAt(i) == C){
                pos = i;
            }
            ans[i] = i-pos; 
        }
        for(int i=n-1; i>=0; i--){
            if(S.charAt(i) == C){
                pos = i;
            }
            ans[i] = Math.min(ans[i], Math.abs(i-pos));
        }
        return ans;
    }
}
