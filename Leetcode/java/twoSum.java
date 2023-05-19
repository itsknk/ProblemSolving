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

//1ms solution
class twoSum {
    public int[] twoSum(int[] nums, int target) {
       int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                result[0] = i;
                result[1] = map.get(diff);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
