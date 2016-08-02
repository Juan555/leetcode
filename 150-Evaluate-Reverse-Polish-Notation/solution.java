public class Solution {
    public int evalRPN(String[] tokens) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        if ( tokens == null || !tokens[0]).isNumetric() ) { return 0; }//???
        for ( int i = 0; i < tokens.length; ++i ) {
            String element = tokens[i];
            if ( element.isNumetric() ) {
                stack.push( element );
            }
            if ( element == "+" || element == "-" || element == "*" || element == "/" ) {
                if ( !stack.isEmpty() ) {
                    int first = stack.pop();
                    if ( !stack.isEmpty() ) {
                        int second = stack.pop();
                    }
                    else { return result; }
                }
                else { return result; }
                if ( element == "+" ) { result = first + second;}
                else if ( element == "-" ) {result = first - second;}
                else if ( element == "*" ) {result = first * second; }
                else { result = first / second; }
                stack.push ( result );
            }
        }
        return result;
    }
}