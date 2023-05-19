class licenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder ans = new StringBuilder();
        int count =0;
        int i = S.length() -1;
        while(i >= 0){
            char current = Character.toUpperCase(S.charAt(i));
            if(current == '-'){
                i--;
            }
            else if(count !=0 && count % K == 0){
                ans.insert(0, '-');
                count = 0;
            }
            else{
                ans.insert(0, current);
                count++;
                i--;
            }
        }
        return ans.toString();
    }
}
