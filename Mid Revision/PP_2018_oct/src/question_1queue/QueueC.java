package question_1queue;

public class QueueC {
    private int rear;
    private int front;
    private int maxSize;
    private int noItems;
    private int[] queueArray;

    public QueueC(int maxSize){
        this.maxSize = maxSize;
        queueArray = new int[maxSize];
        rear = -1;
        front = 0;
        noItems = 0;
    }

    public void insert(int j){
        if (noItems == maxSize){
            System.out.println("Queue is Full");
        }else {
            if (rear == maxSize-1){
                rear = -1;
            }

            queueArray[++rear] = j;
            noItems++;
        }
    }

    public int remove(){
        if (noItems == 0){
            System.out.println("Queue is Empty");
            return -99;
        }else {
            int temp = queueArray[front++];
            if (front == maxSize){
                front = 0;
            }
            noItems--;
            return temp;
        }
    }
}
