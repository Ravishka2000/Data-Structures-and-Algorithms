public class LinkList {
    private Link first;

    public LinkList(){
        first = null;
    }

    public void displayList(){
        Link current = first;
        while(current!=null){
            current.displayLink();
            current = current.next;
        }
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int num){
        Link temp = new Link(num);
        temp.next = first;
        first = temp;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

}
