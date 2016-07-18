public class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        if ( s == "" ) { return false; }
        boolean is_num = false;
        int count_num = 0;
        for ( int i = 0; i < s.length(); ++ i ) {
            char c = s.charAt(i);
            if ( Character.isDigit(c) ) {
                is_num = true;
                count ++;
            }
            else if ( c == 'e' || c == '+' || c == '-' ) {
                if ( !is_num || i == s.length() - 1 ) { return false; }
                int test = i + 1;
                char test_char = s.charAt(test);
                while ( test < s.length() - 1 ) {
                    if ( Character.isDigit ( test_char ) ) { break; }
                    else if ( Character.isWhitespace(test_char) ) { test ++; }
                    else { return false; }
                }
                if ( !Character.isDigit(test_char) ) { return false; }
                is_num = false;
            }
            else if ( c == '.' ) {
                if ( !is_num ) { return false; }
                is_num = false;
            }
            else { return false; }
            
            //if blank, do nothing
            //if num, count ++
            //if "e", make sure front and end are num
            // + -, make sure front and end are num
            // . , make sure front is num
            //no other character besides e
        }
        //if count > 0, return true
        return count_num > 0;
    }
}