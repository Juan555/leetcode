public class Solution {
    public boolean isValid(String s) {
        Stack <char> stack = new Stack<char>();
        for ( int i = 0; i < s.length(); ++i ) {
            char element = s.charAt(i);
            if ( stack.isEmpty() ) {
                if ( element == ')' || element == ']' || element == '}' ) 
                {return false;}
            }
            else {
                if ( element == ')' && stack.pop() != '(' )  {return false;}
                else if ( element == '}' && stack.pop() != '{' ) {return false;}
                else if ( element == ']' && stack.pop() != '[' ) { return false;}
                else { continue;}
            }
        }
        return true;
    }
}