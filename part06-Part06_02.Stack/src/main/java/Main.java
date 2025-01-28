
public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.values());

        stack.add("value1");
        stack.add("value2");
        stack.add("value3");
        System.out.println(stack.isEmpty());
        System.out.println(stack.values());

        String taken = stack.take();
        System.out.println(taken);
    }
}
