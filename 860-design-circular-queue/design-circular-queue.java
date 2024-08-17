class MyCircularQueue {
    static int[] queue;
    static int front;
    static int rear;
    static int size;

    public MyCircularQueue(int k) {
        this.queue = new int[k];
        this.front = -1;
        this.rear = -1;
        this.size = k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        if(front == rear) front = rear = -1;

        else front = (front + 1) % size;

        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        else return queue[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        else return queue[rear];
    }
    
    public boolean isEmpty() {
        if(front == -1 && rear == -1) return true;
        return false;
    }
    
    public boolean isFull() {
        return ((rear+1) % size) == front; 
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */