class maxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0;
        int currentmax = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                currentmax += 1;
                max = Math.max(max,currentmax);
            }
            else{
                currentmax = 0;

            }
        }
        return max;
    }
}
