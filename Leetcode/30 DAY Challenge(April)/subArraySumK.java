class subArraySumK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sumarr = new HashMap<>();
        sumarr.put(0,1);
        int sum = 0;
        int result = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sumarr.containsKey(sum-k)){
                result += sumarr.get(sum-k);
            }
            sumarr.put(sum, sumarr.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
