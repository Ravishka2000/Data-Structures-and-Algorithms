public class StackX {
    private int maxSize;
    private double[] stackArray;
    private int top;

    public StackX(int maxSize){
        this.maxSize = maxSize;
        stackArray = new double[maxSize];
        top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public void push(int no){
        if (top == maxSize-1){
            System.out.println("Stack is Full");
        }else {
            stackArray[++top] = no;
        }
    }

    public double pop(){
        if (top == -1){
            System.out.println("Stack is Empty");
            return -99;
        }else {
            return stackArray[top--];
        }
    }

    public double peek(){
        if (top == -1){
            System.out.println("Stack is Empty");
            return -99;
        } else {
            return stackArray[top];
        }
    }
}
