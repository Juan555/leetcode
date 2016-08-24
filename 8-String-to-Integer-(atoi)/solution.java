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
        long sum = 0;
        for ( int i = start; i < str.length(); ++i ) {
            if ( !Character.isDigit(str.charAt(i)) ) {break;}
            sum = sum*10+(str.charAt(i) - '0');
            if ( sign == 1 && sum > Integer.MAX_VALUE ) {return Integer.MAX_VALUE;}
            if ( sign == -1 && sum < Integer.MIN_VALUE ){ return Integer.MIN_VALUE;}
        }
        return (int)sum*sign;
    }
}