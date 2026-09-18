class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    int min;
    public MinStack() {
        stack = new Stack<>();
        temp = new Stack<>();
    }
    
    public void push(int val) {
         stack.push(val);
         if(temp.isEmpty() || val <= temp.peek()){
            temp.push(val);
         }
    }
    
    public void pop() {
         if(stack.peek().equals(temp.peek())){
            temp.pop();
         }
         stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if(!temp.isEmpty()){
        return temp.peek();
        }
        return -1;
        
    }
}
