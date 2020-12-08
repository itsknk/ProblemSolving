class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1)
            return "";
        int start = 0;
        int end = 0;
        for(int i=0; i<s.length(); i++)
        {
            int l1 = fromMiddle(s,i,i);
            int l2 = fromMiddle(s,i,i+1);
            int l = Math.max(l1,l2);
            if(l > end - start)
            {
                start = i - ((l-1)/2);
                end = i + (l/2);
            }
        }
        return s.substring(start, end+1);
    }
    public int fromMiddle(String s, int left, int right)
    {
        if(s == null || left > right)
            return 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
}
