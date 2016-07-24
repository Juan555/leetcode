public class Solution {
    public boolean isValid(String s) {
        Stack < Character > result = new Stack < Character > ();
        for ( char a: s ) {
            if ( a == "(" || a = "[" || a = "{" ) {
                result.push ( a );
            }
            else if ( a == ")" && !result.isEmpty() && result.peek() == "(" ) {
                result.pop();
            }
            else if ( a == "]" && !result.isEmpty() && result.peek() == "[" ) {
                result.pop();
            }
            else if ( a == "}" && !result.isEmpty() && result.peek() == "{" ) {
                result.pop();
            }
            else { return false; }
        }
        return true;
    }
}