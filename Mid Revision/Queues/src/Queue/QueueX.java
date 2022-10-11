package Queue;

public class QueueX {
    private int maxSize;
    private double[] queueArray;
    private int front;
    private int rear;
    private int noItems;

    public QueueX(int maxSize){
        this.maxSize = maxSize;
        queueArray = new double[maxSize];
        front = 0;
        rear = -1;
        noItems = 0;
    }

    public void insert(int no){
        if (rear == maxSize-1){
            System.out.println("Queue is Full");
        }else {
            queueArray[++rear] = no;
            noItems++;
        }
    }

    public double remove(){
        if (noItems == 0){
            System.out.println("Queue is Empty");
            return -99;
        }else {
            noItems--;
            return queueArray[front++];
        }
    }

    public double peekFront(){
        if (noItems == 0){
            System.out.println("Queue is Empty");
            return -99;
        }else {
            return queueArray[front];
        }
    }

    public boolean isFull(){
        return (rear == maxSize-1);
    }

    public boolean isEmpty(){
        return (noItems == 0);
    }
}
