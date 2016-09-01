public class Solution {
    public int[] plusOne(int[] digits) {
        int update = 0;
        for ( int i = digits.length - 1; i >= 0; ++i ) {
            update = digits[i] == 9? 1:0;
            digits[i] = digits[i] == 9? 0:(digits[i]+1);
        }
        if ( update == 1 ) {
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for ( int i = 1; i < result.length; ++i ) {
                result[i] = digits[i-1];
            }
            return result;
        }
        return digits;
        
    }
}