public class Solution {
    public int myAtoi(String str) {
        // deal with white space
        str = str.trim();
        if ( str.length() == 0 ) { return 0; }
        
        //check sign
        int sign = 1;
        if ( str.charAt(0) == '+' || str.charAt(0) == '-' ) {
            sign = str.charAt(0) == '+'?1:(-1);
        }
        //check digit and overflow
        int result = 0;
        for ( i = 0; i < str.length(); ++i ) {
            //skip the first sign
            if ( str.charAt(0) == '+' || str.charAt(0) == '-' ) {continue;}
            //check if it's valid digit
            int digit = '9' - str.charAt(i);
            if (( digit > 9 ) || ( digit < 0 )) { break; }
            if ( INT_MAX - digit < result ) {return INT_MAX;}
            else if ( INT_MIN + digit > result ) { return INT_MIN;}
            else{ result = result*10 + sign == 1?digit:digit*(-1);}
        }
        return result;
    }
}