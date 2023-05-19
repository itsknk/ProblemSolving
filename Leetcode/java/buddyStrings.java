class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length() != B.length())
            return false;
        if(A.equals(B))
        {
            HashSet<Character> set = new HashSet();
            for(char c : A.toCharArray())
            {
                set.add(c);
            }
            if(set.size() < A.length())
                return true;
            else
                return false;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<A.length(); i++)
        {
            if(A.charAt(i) != B.charAt(i))
                ans.add(i);
        }
        if(ans.size() == 2 && A.charAt(ans.get(0)) == B.charAt(ans.get(1)) && B.charAt(ans.get(0)) == A.charAt(ans.get(1)))
            return true;
        else
            return false;
    }
}
