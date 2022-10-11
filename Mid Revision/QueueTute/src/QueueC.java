public class QueueC {
    private int front;
    private int rear;
    private int maxSize;
    private int noItems;
    private char[] queueArray;

    public QueueC(int maxSize){
        this.maxSize = maxSize;
        front = 0;
        rear = -1;
        noItems = 0;
        queueArray = new char[maxSize];
    }

    public void insert(char ch){
        if (noItems == maxSize) {
            System.out.println("Queue is Full");
        }else {
            if (rear == maxSize-1){
                rear = -1;
            }
            queueArray[++rear] = ch;
            noItems++;
        }
    }

    public char remove(){
        if (noItems == 0){
            System.out.println("Queue is Empty");
            return 0;
        }else {
            char temp = queueArray[front++];
            if (front == maxSize){
                front = 0;
            }
            noItems--;
            return temp;
        }
    }

    public char peekFront(){
        if (noItems == 0){
            System.out.println("Queue is Empty");
            return 0;
        }else {
            if (front == maxSize){
                front = 0;
            }
            return queueArray[front];
        }
    }

    public boolean isEmpty(){
        return (noItems == 0);
    }

    public boolean isFull(){
        return (noItems == maxSize);
    }

}
