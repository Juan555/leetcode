import java.util.Stack;
public class MinStack {

    /** initialize your data structure here. */
    
    private Stack<Integer> helper_stack = new Stack<>;
    private Stack<Integer> minStack = new Stack<>;
    
    
    public void push(int x) {
        minStack.push (x);
        if ( !helper_stack. isEmpty() ) {
            if ( helper_stack.peek() < x) {
                helper_stack.pop();
                helper_stack.push(x);
            }
        }
        else {
            helper_stack.push (x);
        }
        
    }
    
    public void pop() {
        if ( !minStack.isEmpty() ) {
            int temp = minStack.peek();
            minStack.pop();
            if ( !helper_stack.isEmpty() ) {
                if ( temp == helper_stack.peek() ) {
                    helper_stack.pop();
                }
            }
        }
        
    }
    
    public int top() {
        minStack.peek();
    }
    
    public int getMin() {
        helper_stack.peek();
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