class maximumsubArray {
    public int maxSubArray(int[] nums) {
        int current = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            if(current <=0 && nums[i] > current){
                current = nums[i];}
            else{
                current += nums[i];}
            if(current > max)
                max = current;
        }
        return max;
    }
}