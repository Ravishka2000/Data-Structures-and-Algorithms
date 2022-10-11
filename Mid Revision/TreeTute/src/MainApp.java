public class MainApp {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(100);
        tree.insert(200);
        tree.insert(300);
        tree.insert(400);

        tree.find(300).displayNode();

        tree.minimum().displayNode();
        tree.maximum().displayNode();
    }
}
