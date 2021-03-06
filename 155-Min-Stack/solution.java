import java.util.Stack;
public class MinStack {

    /** initialize your data structure here. */
    
    private Stack<Integer> helper_stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    
    
    public void push(int x) {
        minStack.push (x);
        if ( helper_stack. isEmpty() || helper_stack.peek() >= x ) {
            helper_stack.push (x);
        }
    }
    
    public void pop() {
        if ( !minStack.isEmpty() ) {
            if ( minStack.pop().equals(helper_stack.peek()) ) {
                helper_stack.pop();
            }
        }
        else {return;}
        
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        if ( !helper_stack.isEmpty() ){
            return helper_stack.peek();
        }
        return 0;
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