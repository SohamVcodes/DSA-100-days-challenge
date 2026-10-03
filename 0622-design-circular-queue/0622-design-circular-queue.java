class MyCircularQueue {

    static int arr[];
    static int size;
    static int rear;
    static int front;

    public MyCircularQueue(int k) {
        arr = new int[k];
        size = k;
        rear = -1;
        front = -1;
    }

    public boolean enQueue(int value) {

        if (isFull())
            return false;

        if (front == -1)
            front = 0;

        rear = (rear + 1) % size;
        arr[rear] = value;

        return true;
    }

    public boolean deQueue() {

        if (isEmpty())
            return false;

        if (front == rear) {
            front = -1;
            rear = -1;
        } 
        else {
            front = (front + 1) % size;
        }

        return true;
    }

    public int Front() {

        if (isEmpty())
            return -1;

        return arr[front];
    }

    public int Rear() {

        if (isEmpty())
            return -1;

        return arr[rear];
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }
}