class Solution {
    public String getHint(String secret, String guess) {
        if(secret == null || secret.length() == 0 || guess == null || guess.length() == 0){
            return "0A0B";
        }
        int a1[] = new int[10];
        int a2[] = new int[10];
        int bulls =0;
        int cows =0;
        for(int i=0; i<secret.length(); i++){
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if(s == g){
                bulls++;
            }
            else{
                a1[s]++;
                a2[g]++;
            }
        }
        for(int i=0; i<10; i++){
            cows += Math.min(a1[i],a2[i]);
        }
        return bulls + "A" + cows + "B";
        
    }
}
