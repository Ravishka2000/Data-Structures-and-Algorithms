public class Link {
    public int iData;
    public Link next;

    public Link(int id){
        next = null;
        iData = id;
    }

    public void displayLink(){
        System.out.println(iData);
    }
}
