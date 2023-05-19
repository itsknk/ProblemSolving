class distributeCandies {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i=0;
        int loop=0;//how many rounds 
        while(candies > 0){
            if(i == num_people){
                i=0;
                loop++;
            }
            int current = (loop*num_people)+(i+1);
            if(candies - current < 0){
                ans[i] += candies;
            }
            else{
                ans[i] += current;
            }
            i++;
            candies -= current;
        }
        return ans;
    }
}
