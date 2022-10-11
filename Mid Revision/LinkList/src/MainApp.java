public class MainApp {
    public static void main(String[] args) {
        LinkList myLinkList = new LinkList();
        myLinkList.insertFirst(100);
        myLinkList.insertFirst(200);
        myLinkList.insertFirst(300);

        myLinkList.displayList();

        myLinkList.deleteFirst();
        myLinkList.displayList();
    }
}
