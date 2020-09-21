package recursion;

import java.util.Stack;

// sort stack using recursion
public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(10);
        stack.push(0);
        stack.push(6);

        SortStack sortStack = new SortStack();
        sortStack.sort(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        Integer num = stack.peek();
        stack.pop();
        sort(stack);
        insert(stack, num);
    }

    private void insert(Stack<Integer> stack, Integer num) {
        if (stack.isEmpty() || stack.peek() < num) {
            stack.push(num);
            return;
        }
        int temp = stack.peek();
        stack.pop();
        insert(stack, num);
        stack.push(temp);
    }

}
