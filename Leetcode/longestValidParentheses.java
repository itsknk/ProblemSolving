class Solution {
    public int longestValidParentheses(String s) {
        if(s==null  || s.length()==0){
            return 0;
        }
        int a =0;
        int b =0;
        int max=0;
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(') {
                a++;
            } else {
                b++;
            }
            if (a == b) {
                max = Math.max(max, a + b);
            } else if (b > a) {
                a = 0;
                b = 0;
            }
        }
        a=0;
        b=0;
         for(int i=s.length()-1; i>=0; i--){
            if (s.charAt(i) == ')') {
                b++;
            } else {
                a++;
            }
            if (a == b) {
                max = Math.max(max, a + b);
            } else if (a > b) {
                a = 0;
                b = 0;
            }
        }
        return max;
        }
    }
