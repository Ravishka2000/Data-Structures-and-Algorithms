public class MainApp {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(20,40);
        tree.insert(50,70);
        tree.insert(10,70);
        tree.insert(550,70);
        tree.insert(110,70);

        tree.find(10).displayNode();
    }
}
