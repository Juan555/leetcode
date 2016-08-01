public class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        for ( int i = 0; i < s.length(); ++i ) {
            char element = s.charAt(i);
            if ( element == '(' || element == '[' || element == '{' ) {
                stack.push (element);
            }
            else if ( element == ')' && !stack.isEmpty() && stack.peek() == '(' ) {
                stack.pop();
            }
            else if ( element == ']' && !stack.isEmpty() && stack.peek() == '[' ) {
                stack.pop();
            }
            else if ( element == '}' && !stack.isEmpty() && stack.peek() == '{' ) {
                stack.pop();
            }
            else { return false; }
        }
        return stack.isEmpty();
    }
}