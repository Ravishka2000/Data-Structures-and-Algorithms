package question_2Link;

public class Link {
    public int eNo;
    public String name;
    public Link next;

    public Link(int eNo, String name) {
        this.eNo = eNo;
        this.name = name;
        next = null;
    }

    public void displayEmployee(){
        System.out.println("EID : " + eNo);
        System.out.println("Name : " + name);
        System.out.println();
    }

}
