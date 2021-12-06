public class Main {

    public static void main(String[] args) {
        StackWithPeekMin stack = new StackWithPeekMin();

        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(1);

        System.out.println("Min element: " + stack.peekMin());
        stack.pop();
        System.out.println("Min element: " + stack.peekMin());
        stack.pop();
        System.out.println("Min element: " + stack.peekMin());
        stack.pop();
        System.out.println("Min element: " + stack.peekMin());
        stack.pop();
        System.out.println("Min element: " + stack.peekMin());

    }
}
