class defangIPAddress {
    public String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<address.length(); i++){
            char current = address.charAt(i);
            if(current == '.'){
                ans.append("[.]");
            }
            else{
                ans.append(current);
            }
        }
        return ans.toString();
    }
}
