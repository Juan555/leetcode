public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for ( String i: tokens ) {
            if ( i == "+" || i == "-" || i == "*" || i == "/" ) {
                int b = stack.pop();
                int a = stack.pop();
                if ( i == "+" ) { stack.push( a + b ); }
                else if ( i == "-" ) { stack.push( a - b ); }
                else if ( i == "*" ) { stack.push( a * b ); }
                else { stack.push ( a / b ); }
            }
            else { stack.push( Integer.parseInt(i) ); }
        }
        return stack.pop();
    }
}