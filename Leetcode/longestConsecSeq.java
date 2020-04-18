class longestConsecSeq {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num: nums){
            set.add(num);
        }
          int max_length = 0;
        for(int i=0; i<nums.length; i++){
            int current_num = nums[i];
            int current_length = 1;
          
            if(!set.contains(current_num-1)){
                while(set.contains(current_num + 1)){
                    current_num += 1;
                    current_length +=1;
                }
            }
            max_length = Math.max(current_length, max_length);
        }
        return max_length;
    }
}
