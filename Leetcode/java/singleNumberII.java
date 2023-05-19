class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> ans = new HashMap<Integer, Integer>();
        for(int i:nums){
            ans.put(i, ans.getOrDefault(i, 0)+1);
        }
        for(int key:ans.keySet()){
            if(ans.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}
