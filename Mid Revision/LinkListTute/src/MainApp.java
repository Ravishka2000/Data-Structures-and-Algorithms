public class MainApp {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(20);
        linkList.insertFirst(50);
        linkList.insertFirst(70);
        linkList.insertFirst(90);

        linkList.displayList();
        System.out.println();

        linkList.insertAfter(50,60);

        linkList.displayList();
        System.out.println();

        linkList.delete(20);
        linkList.displayList();

        Link temp = linkList.find(90);

        if (temp == null){
            System.out.println("Value Not Found");
        }else {
            temp.displayLink();
        }
    }
}
