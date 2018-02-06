package linear.stack;

import java.util.Stack;

/**
 * Created by justin on 2/6/18.
 */
public class MinStack {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MinStack() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public int pop() {
        if (stackData.empty()) {
            throw new RuntimeException("Stack is empty.");
        }
        int value = stackData.pop();
        if (value == this.getMin()) {
            this.stackMin.pop();
        }
        return value;
    }

    public void push(int i) {
        if (this.stackMin.empty()) {
            this.stackMin.push(i);
        } else if (i < this.getMin()) {
            this.stackMin.push(i);
        }
        this.stackData.push(i);
    }

    public int getMin() {
        if (this.stackMin.empty()){
            throw new RuntimeException("Stack is empty");
        }
        return this.stackMin.peek();
    }

}
