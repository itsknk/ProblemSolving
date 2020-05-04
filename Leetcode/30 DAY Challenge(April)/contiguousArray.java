class contiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int count =0, max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                count += -1;
            }
            else{
                count += 1;
            }
            if(map.containsKey(count)){
                max = Math.max(max, i-map.get(count));
            }
            else{
                map.put(count, i);
            }
        }
        return max;
    }
}