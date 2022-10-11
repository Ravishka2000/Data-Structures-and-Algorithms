package question_1b;

public class StackX {
    private int top;
    private int maxSize;
    private char[] stackArray;

    public StackX(int maxSize){
        this.maxSize = maxSize;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char ch){
        if (top == maxSize-1){
            System.out.println("Stack is Full");
        }else {
            stackArray[++top] = ch;
        }
    }

    public char pop(){
        if (top == -1){
            System.out.println("stack is empty");
            return 0;
        }else {
            return stackArray[top--];
        }
    }

    public char peek(){
        if (top == -1){
            System.out.println("Stack is Empty");
            return 0;
        }else {
            return stackArray[top];
        }
    }
}
