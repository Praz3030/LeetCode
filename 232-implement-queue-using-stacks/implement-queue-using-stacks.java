class MyQueue {
    static Stack<Integer>s1;
    static Stack<Integer>s2;

    public MyQueue() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }
    
    public void push(int x) {
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(x);

        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }

    }
    
    public int pop() {
        if(empty()) {
            return -1;
        }
        return s1.pop();
    }
    
    public int peek() {
        if(empty()) {
            return -1;
        }
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */