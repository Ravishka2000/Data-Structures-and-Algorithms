package question_2Link;

public class LinkList {
    private Link first;

    public LinkList(){
        first = null;
    }

    public void insertFirst(int eid, String name){
        Link newLink = new Link(eid,name);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void sortedInsert(int empNo, String name){
        Link newLink = new Link(empNo, name);

        if (first == null){
            first = newLink;
        } else {
            Link curr = first;
            Link prev = first;
            if (empNo > curr.eNo) {
                while (curr != null && empNo > curr.eNo) {
                    prev = curr;
                    curr = curr.next;
                }
                prev.next = newLink;
                newLink.next = curr;
            } else if (empNo < curr.eNo) {
                newLink.next = first;
                first = newLink;
            }
        }
    }

}
