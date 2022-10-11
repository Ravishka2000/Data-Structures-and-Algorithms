package question_2Link;

public class MainApp {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.sortedInsert(10,"aaa");
        linkList.sortedInsert(20,"bbb");
        linkList.sortedInsert(500,"ccc");
        linkList.sortedInsert(40,"ddd");
        linkList.sortedInsert(5,"eee");

        linkList.deleteFirst().displayEmployee();
        linkList.deleteFirst().displayEmployee();
        linkList.deleteFirst().displayEmployee();
        linkList.deleteFirst().displayEmployee();
        linkList.deleteFirst().displayEmployee();
    }
}
