import java.util.Stack;

public class StackWithPeekMin {

    private Stack<StackItem> stack = new Stack();
    private Integer minElem = 0;

    public StackWithPeekMin() {
    }

    public Integer push(Integer x) {
        if (minElem > x || isEmpty()) {
            minElem = x;
        }
        System.out.println("Pushing " + x + "...");
        return stack.push(new StackItem(x, minElem)).getValue();
    }

    public Integer pop() {
        if (stack.empty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            System.out.println("Poping...");
            return stack.pop().getValue();
        }

    }

    public Integer peek() {
        if (stack.empty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            System.out.println("Peeking...");
            return stack.peek().getValue();
        }
    }

    public Integer peekMin() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            System.out.println("Peeking min element...");
            return stack.peek().getMinItemInStackWhenValueIsTop();
        }
    }

    public Boolean isEmpty() {
        return stack.empty();
    }

}