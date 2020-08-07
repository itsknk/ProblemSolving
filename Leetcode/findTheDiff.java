class Solution {
    public char findTheDifference(String s, String t) {
     char[] total = (s+t).toCharArray();
     char ans = total[0];
     for(int i=1; i<total.length; i++){
         ans ^= total[i];
     }
        return ans;
    }
}
