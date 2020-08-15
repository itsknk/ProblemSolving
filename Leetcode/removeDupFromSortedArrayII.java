class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int a = 2;
        for(int b = 2; b<nums.length; b++){
            if(nums[a-2] != nums[b]){
                nums[a++] = nums[b];
            }
        }
        return a;
    }
}
