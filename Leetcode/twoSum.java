class twoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int diff = target - nums[i];
                
                if(nums[j] == diff){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("no match found");
    }
}