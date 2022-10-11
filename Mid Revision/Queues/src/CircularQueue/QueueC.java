package CircularQueue;

public class QueueC {
    private int maxSize;
    private double[] queueArray;
    private int front;
    private int rear;
    private int noItems;

    public QueueC(int maxSize){
        this.maxSize = maxSize;
        queueArray = new double[maxSize];
        front = 0;
        rear = -1;
        noItems = 0;
    }

    public void insert(int num){
        if (noItems == maxSize){
            System.out.println("Queue is Full");
        }else {
            if (rear == maxSize-1)
                rear = -1;
            queueArray[++rear] = num;
            noItems++;
        }
    }

    public double remove(){
        if (noItems == 0){
            System.out.println("Queue is Empty");
            return -99;
        }else {
            double temp = queueArray[front++];
            if (front == maxSize){
                front = 0;
            }
            noItems--;
            return temp;
        }
    }

    public double peekFront(){
        if (noItems == 0){
            System.out.println("Queue is Empty");
            return -99;
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
