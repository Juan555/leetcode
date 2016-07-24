public class Solution {
    public boolean isValid(String s) {
        Stack < char > result = new Stack < char > ();
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