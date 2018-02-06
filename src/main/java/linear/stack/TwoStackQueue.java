package linear.stack;

import java.util.Stack;

/**
 * Created by justin on 2/6/18.
 * <p>
 * implement a queue using two stacks
 */
public class TwoStackQueue {

    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    public void add(int i) {
        stackPush.push(i);
    }

    public int poll() {
        if (stackPush.empty() && stackPop.empty()) {
            throw new RuntimeException("Queue is empty");
        } else if (stackPop.empty()) {
            while(!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek() {
        if (stackPush.empty() && stackPop.empty()) {
            throw new RuntimeException("Queue is empty");
        } else if (stackPop.empty()) {
            while(!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }
}
