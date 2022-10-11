public class Link {
    public int iData;
    public Link next;

    public Link(int val){
        iData = val;
        next = null;
    }

    public void displayLink(){
        System.out.println(iData);
    }
}
