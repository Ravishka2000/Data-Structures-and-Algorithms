public class MainApp {
    public static void main(String[] args) {
        StackX stack = new StackX(4);

        stack.push(59);
        stack.push(56);
        stack.push(51);
        stack.push(52);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
