class jumpGame {
    public boolean canJump(int[] nums) {
        int lastAnsPosition = nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            if(i + nums[i] >= lastAnsPosition){
                lastAnsPosition = i;
            }
        }
        return lastAnsPosition == 0;
    }
}
