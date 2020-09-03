class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('a');
        vowels.add('E');
        vowels.add('e');
        vowels.add('I');
        vowels.add('i');
        vowels.add('O');
        vowels.add('o');
        vowels.add('U');
        vowels.add('u');
        int i=0;
        int j=s.length()-1;
        char[] characters = s.toCharArray();
        while(i<j){
            while(i<j && !vowels.contains(characters[i])){
                i++;
            }
            while(i<j && !vowels.contains(characters[j])){
                j--;
            }
            char temp = characters[i];
            characters[i++] = characters[j];
            characters[j--] = temp;
        }
        return new String(characters);
    }
}
