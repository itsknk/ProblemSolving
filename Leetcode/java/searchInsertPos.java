class searchInsertPos {
    public int searchInsert(int[] nums, int target) {
        int count=0;
        for (int i : nums){
            if(i == target || i > target){
                return count;
            }
            count ++;
        }
        return count;
    }
}
