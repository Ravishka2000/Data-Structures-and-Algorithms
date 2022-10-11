public class LinkList {
    private Link first;

    public LinkList(){
        first = null;
    }

    public void insertFirst(int id){
        Link newlink = new Link(id);
        newlink.next = first;
        first = newlink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public boolean insertAfter(int key, int newData){
        Link current = first;
        Link newLink = new Link(newData);
        while(current.iData != key){
            current = current.next;
        }
        if (current == null){
            return false;
        }else {
            Link temp = current.next;
            current.next = newLink;
            newLink.next = temp;
            return true;
        }
    }

    public void displayList(){
        Link current = first;
        while (current!=null){
            current.displayLink();
            current = current.next;
        }
    }

    public boolean delete(int key){
        Link current = first;
        Link previous = first;
        while(current.iData != key){
            previous = current;
            current = current.next;
        }
        if (current == null){
            return false;
        }else {
            previous.next = current.next;
            return true;
        }
    }

    public Link find(int key){
        Link current = first;
        while (current != null){
            if (current.iData == key){
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
