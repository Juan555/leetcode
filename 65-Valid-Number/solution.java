public class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        if ( s == "" ) { return false; }
        boolean num = false;
        boolean cal = false;
        boolean exp = false;
        boolean dot = false;
        int i = 0;
        if ( s.charAt(i) == '+' || s.charAt(i) == '-' ) { 
            i = 1; 
            cal = true;
        }
        
        while ( i < s.length() ) {//you only need to consider right situation
            char c = s.charAt(i);
            if ( Character.isDigit(c) ) { num = true; }
            else {
               if ( c == 'e' ) {
                exp = true;
                num = false;
                }
                else if ( c == '+' || c == '-')  {
                    num = false;
                    cal = true;
                
                 }
                else if ( c == '.') {
                    dot = true;
                    num = false;
                
                 }
                 else { return false; } 
            }
            ++i;
        }
        return num;//??
        // boolean is_num = false;
        // int count_num = 0;
        // for ( int i = 0; i < s.length(); ++ i ) {
        //     char c = s.charAt(i);
        //     if ( Character.isDigit(c) ) {
        //         is_num = true;
        //         count_num ++;
        //     }
        //     else if ( c == 'e' || c == '+' || c == '-' ) {
        //         if ( !is_num || i == s.length() - 1 ) { return false; }
        //         int test = i + 1;
        //         char test_char = s.charAt(test);
        //         while ( test < s.length() ) {
        //             if ( Character.isDigit ( test_char ) ) { break; }
        //             else if ( Character.isWhitespace(test_char) ) { test ++; }
        //             else { return false; }
        //         }
        //         if ( !Character.isDigit(test_char) ) { return false; }
        //         is_num = false;
        //     }
        //     else if ( c == '.' ) {  //bug here: .1 is also a number
            
        //         if ( !is_num ){     //another bug: 0.. & .1. is not a number
        //             if ( i == (s.length() - 1) ) { return false; }
        //             int dot_test = i + 1;
        //             char dot_char = s.charAt ( dot_test );
        //             while ( dot_test < s.length() ) {
        //                 if ( Character.isDigit (dot_char ) ) { break; }
        //                 else if ( Character.isWhitespace( dot_char ) ) {dot_test ++; }
        //                 else { return false; }
        //             }
        //             if ( !Character.isDigit(dot_char) ) {return false;} // pay attention to dot_char and dot_test
                    
        //         }
        //         is_num = false;
                
        //     }
        //     else { return false; }
            
            //if blank, do nothing
            //if num, count ++
            //if "e", make sure front and end are num
            // + -, make sure front and end are num
            // . , make sure front is num
            //no other character besides e
        //}
        //if count > 0, return true
        // return (count_num > 0);
    }
}