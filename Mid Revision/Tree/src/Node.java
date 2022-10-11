public class Node {
    public int iData;
    public int dData;
    public Node leftChild;
    public Node rightChild;

    public void displayNode(){
        System.out.println("{" + iData + ", " + dData + "}");
    }
}
