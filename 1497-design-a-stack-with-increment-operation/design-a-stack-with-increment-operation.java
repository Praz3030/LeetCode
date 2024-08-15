class CustomStack {
    private int[] stack;
    private int index;
    private int maxSize;
    
    public CustomStack(int maxSize) {
        this.stack = new int[maxSize];
        this.index = 0;
        this.maxSize = maxSize;
    }
    
    public void push(int x) {

        if (index < maxSize) {
            stack[index++] = x;
        }
    }
    
    public int pop() {
        if (index == 0) {
            return -1;
        }
        return stack[--index];
    }
    
    public void increment(int k, int val) {
        
        int limit = Math.min(k, index);

        for (int i = 0; i < limit; i++) {
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */