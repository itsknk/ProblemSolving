//simple 
class MinStack {

    /** initialize your data structure here. */
  Stack<Integer> s1 = new Stack<>();
  Stack<Integer> min = new Stack<>();
    
    public void push(int x) {
     if(min.isEmpty() || x <= min.peek()){
         min.push(x);
     }   
        s1.push(x);
    }
    
    public void pop() {
      if(s1.peek().equals(min.peek())){
          min.pop();
      }  
        s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
 
 //okish
 class MinStack {

    /** initialize your data structure here. */
  int min = Integer.MAX_VALUE;  
  Stack<Integer> s1 = new Stack<>();

    public void push(int x) {
     if(x <= min){
         s1.push(min);
         min=x;
     }   
        s1.push(x);
    }
    
    public void pop() {
      if(s1.pop() == min){
          min=s1.pop();
      }  
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
