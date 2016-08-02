public class Solution {
    public int longestValidParentheses(String s) {
     Stack<Integer> stack = new Stack<>();
     int length = s.length();
     for ( int i = 0; i < length; ++i ) {
         char element = s.charAt(i);
         if ( element == '(' ) {
             stack.push(i);
         }
         else {
             if ( !stack.isEmpty() ) {
                 if (s.charAt(stack.peek()) == '(') {
                     stack.pop();
                 }
                 else { stack.push(i); }
             }
             else { stack.push(i); }
         }
     }
     if ( stack.isEmpty() ) { return length; }
     int start = 0;
     int end = length;
     int max = 0;
     while ( !stack.isEmpty() ) {
         start = stack.pop();
         max = Math.max( max, end - start - 1);
         end = start;
     }
     max = Math.max( max, end);
     return max;
    }
}