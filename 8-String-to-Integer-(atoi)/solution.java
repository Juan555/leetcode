public class Solution {
    public int myAtoi(String str) {
        // deal with white space
        str = str.trim();
        if ( str.length() == 0 ) { return 0; }
        
        //check sign
        int sign = 1;
        int start = 0;
        if ( str.charAt(0) == '+' || str.charAt(0) == '-' ) {
            sign = str.charAt(0) == '+'?1:(-1);
            start++;
        }
        //check digit and overflow
        int result = 0;
        for ( int i = start; i < str.length(); ++i ) {
            //skip the first sign
            // if ( str.charAt(0) == '+' || str.charAt(0) == '-' ) {continue;}
            //check if it's valid digit
            int digit = str.charAt(i) - '0';
            if (( digit > 9 ) || ( digit < 0 )) { break; }
            if ( sign == 1 && Integer.MAX_VALUE - digit <= result*10 ) {return Integer.MAX_VALUE;}
            else if ( sign == -1 && Integer.MIN_VALUE + digit >= result*10 ) { return Integer.MIN_VALUE ;}
            else{ result = result*10 + (sign == 1?digit:digit*sign);}
        }
        return result;
    }
}