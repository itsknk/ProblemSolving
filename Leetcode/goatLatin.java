class goatLatin {
    public String toGoatLatin(String S) {
        HashSet<Character> vowels = new HashSet<>();
        for(char c: "aeiouAEIOU".toCharArray()){
            vowels.add(c);
        }
        String result = "";
        int index = 1;
        for(String word : S.split("\\s")){
            if(index > 1){
                result += " ";
            }
            char firstLetter = word.charAt(0);
            if(vowels.contains(firstLetter)){
                result += word + "ma";
            }
            else{
                result += word.substring(1) + firstLetter + "ma";
            }
            for(int i =0; i<index; i++){
                result += "a";
            }
            index += 1;
        }
        return result;
    }
}
