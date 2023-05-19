class wordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if(pattern.length() != words.length){ return false;}
         HashMap <Character, String> map = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char current = pattern.charAt(i);
            if(map.containsKey(current)){
                if(!map.get(current).equals(words[i])){
                    return false;
                }
            }
            else {
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(current,words[i]);
            }
        }
        return true;
    }
}
