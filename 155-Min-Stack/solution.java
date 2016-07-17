import java.util.Stack;
public class MinStack {

    /** initialize your data structure here. */
    
    private Stack<Integer> s = new Stack<>();
    /**
     * Standard solution, two stacks.
     * A minStack to store minimums.
     */
    private Stack<Integer> minStack = new Stack<>();

    /**
     * Push x to stack.
     * After that, check min stack.
     * Push to min stack if min stack is empty or x is smaller than the top of min stack.
     */
    public void push(int x) {
        s.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) { // even smaller
            minStack.push(x);
        }
    }

    /**
     * Pop from s.
     * Check if the value is current min.
     * If it is, pop from min stack as well.
     */
    public void pop() {
        if (s.pop().equals(minStack.peek())) minStack.pop();
    }

    public int top() {
        return s.peek();
    }

    /**
     * Peek min stack to get current minimum.
     */
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */