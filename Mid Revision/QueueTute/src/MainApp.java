public class MainApp {
    public static void main(String[] args) {
        QueueC queueC = new QueueC(4);
        queueC.insert('l');
        queueC.insert('m');
        queueC.insert('n');
        queueC.insert('o');

        queueC.remove();
        queueC.remove();


        queueC.insert('r');
        queueC.insert('r');
        System.out.println(queueC.peekFront());

        while (!queueC.isEmpty()){
            System.out.println(queueC.remove());
        }
    }
}
