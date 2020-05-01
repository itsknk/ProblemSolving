class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> main = new Stack();
    Stack<Integer> min = new Stack();
    public void push(int x) {
        if(min.isEmpty() || x<=min.peek()){
            min.push(x);
        }
        main.push(x);
    }
    
    public void pop() {
        if(main.peek().equals(min.peek())){
            min.pop();
        }
        main.pop();
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
