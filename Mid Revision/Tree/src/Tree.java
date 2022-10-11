public class Tree {
    private Node root;

    public Tree(){
        root = null;
    }

    public Node find(int key){
        Node current = root;
        while(current.iData != key){
            if (key < current.iData){
                current = current.leftChild;
            }else {
                current = current.rightChild;
            }

            if (current == null){
                return null;
            }
        }
        return current;
    }

    public void insert(int id, int dd){
        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;

        if (root == null){
            root = newNode;
        }else {
            Node previous = root;
            Node current = root;

            while(true){
                previous = current;

                if (id < current.iData){
                    current = current.leftChild;
                    if (current == null){
                        previous.leftChild = newNode;
                        return;
                    }
                }else {
                    current = current.rightChild;
                    if (current == null){
                        previous.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }
}
