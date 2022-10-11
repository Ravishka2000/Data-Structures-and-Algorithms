package CircularQueue;

public class MainApp {
    public static void main(String[] args) {
        QueueC myQueue = new QueueC(4);
        myQueue.insert(3);
        myQueue.insert(2);
        myQueue.insert(4);
        myQueue.insert(6);

        System.out.println();
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());

        System.out.println("");
        System.out.println(myQueue.peekFront());


        myQueue.insert(7);
        myQueue.insert(8);
        myQueue.insert(9);

        System.out.println("");
        System.out.println(myQueue.peekFront());

        System.out.println();
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());

        System.out.println("");
        System.out.println(myQueue.peekFront());
    }
}
