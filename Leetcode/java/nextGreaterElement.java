class nextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> greatest = new HashMap<>();
        Stack<Integer> st = new Stack();
        for( int n : nums2){
            while(!st.isEmpty() && st.peek() < n){
                greatest.put(st.pop(), n);
            }
            st.push(n);
        }
        for(int i=0; i<nums1.length; i++){
            nums1[i] = greatest.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}
