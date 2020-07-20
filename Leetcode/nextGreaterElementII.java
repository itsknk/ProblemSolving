class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr,-1);
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n*2; i++){
         while(!st.isEmpty() && nums[st.peek()] < nums[i%n]){
             arr[st.pop()] = nums[i%n];
         }
            if(i < n){
                st.push(i);
            }
        }
        return arr;
    }
}

