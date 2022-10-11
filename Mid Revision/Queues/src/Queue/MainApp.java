package Queue;

public class MainApp {
    public static void main(String[] args){
        QueueX myQueue = new QueueX(5);
        myQueue.insert(23);
        myQueue.insert(12);
        myQueue.insert(54);
        myQueue.insert(65);
        myQueue.insert(34);

        while (!myQueue.isEmpty()){
            System.out.println(myQueue.remove());
        }
    }
}
