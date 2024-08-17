class MinStack {
    private List<Integer>stack;

    public MinStack() {
        this.stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        if (stack.size() == 0) return;
        else stack.remove(stack.size() - 1);
    }
    
    public int top() {
        if (stack.size() == 0) return -1;
        else return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        if (stack.size() == 0) return -1;
        int min = Integer.MAX_VALUE;
        for(int i : stack){
            min = Math.min(i , min);
        }
        return min;
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