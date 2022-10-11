public class MainApp {
    public static void main(String[] args){
        StackX stack = new StackX(10);
        stack.push('g');
        stack.push('t');
        stack.push('o');
        stack.push('p');

        System.out.println(stack.getCount());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
