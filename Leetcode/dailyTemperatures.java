class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
    
    if (T.length == 0){
        return ans;
    }        
    
    Stack<Integer> st = new Stack<>();
    
    st.push(0);
    
    for (int i = 1; i < T.length; i++) { 
        while (!st.isEmpty() && T[st.peek()] < T[i]) { 
            ans[st.peek()] = i - st.pop();   
        }                                            
        st.push(i); 
    }
    return ans;
    }
}
