package linear.stack;

import java.util.Stack;

/**
 * Created by justin on 2/6/18.
 */
public class reverseStack {

    public static int getAndRemoveLast(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.empty()) {
            return result;
        } else {
            int last = getAndRemoveLast(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack) {
        if(stack.empty()){
            return;
        }
        int i = getAndRemoveLast(stack);
        reverse(stack);
        stack.push(i);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        reverse(stack);

        System.out.println(stack);
    }
}
