public class Tree {
    private Node root;

    public Node find(int key){
        Node current = root;
        while(key != current.height) {
            if (key < current.height) {
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

    public void insert(int height){
        Node newNode = new Node(height);
        if (root == null){
            root = newNode;
        }else {
            Node current = root;
            Node parent = root;
            while (true){
                parent = current;
                if (height < current.height){
                    current = current.leftChild;
                    if (current == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else {
                    current = current.rightChild;
                    if (current == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node minimum(){
        if (root == null){
            return null;
        }else {
            Node current = root;
            Node parent;
            while (true){
                parent = current;
                current = current.leftChild;
                if (current == null){
                    return parent;
                }
            }
        }
    }

    public Node maximum(){
        if (root == null){
            return null;
        }else {
            Node current = root;
            Node parent;
            while (true){
                parent = current;
                current = current.rightChild;
                if (current == null){
                    return parent;
                }
            }
        }
    }

    private void inOrder(Node localRoot){
        if (localRoot != null){
            inOrder(localRoot.leftChild);
            localRoot.displayNode();
            inOrder(localRoot.rightChild);
        }
    }
}
