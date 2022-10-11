public class Node {
    public int height;
    public Node leftChild;
    public Node rightChild;

    public Node(int height) {
        this.height = height;
    }

    public void displayNode(){
        System.out.println(height);
    }
}
