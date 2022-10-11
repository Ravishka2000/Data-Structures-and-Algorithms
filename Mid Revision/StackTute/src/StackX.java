public class StackX {
    private int top;
    private int maxSize;
    private char[] stackArr;

    public StackX(int maxSize){
        this.maxSize = maxSize;
        stackArr = new char[maxSize];
        top = -1;
    }

    public void push(char x){
        if (top == maxSize-1){
            System.out.println("Stack is Full");
        }else {
            stackArr[++top] = x;
        }
    }

    public char pop(){
        if (top == -1){
            System.out.println("Stack is Empty");
            return 0;
        }else {
            return stackArr[top--];
        }
    }

    public char peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return 0;
        }else {
            return stackArr[top];
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public int getCount(){
        return top+1;
    }
}
