class MinStack {
    
    private Stack<Integer> stack;
    private Stack<Integer> min_stack;

    public MinStack() {
        this.stack = new Stack<>();
        this.min_stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(val);
            min_stack.push(val);
        } else {
            stack.push(val);
            if(val < min_stack.peek()){
                min_stack.push(val);
            } else {
                min_stack.push(min_stack.peek());
            }
        }
    }
    
    public void pop() {
        stack.pop();
        min_stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min_stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
