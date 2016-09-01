public class Solution {
    public int[] plusOne(int[] digits) {
        int pre_sum = digits[digits.length-1] + 1;
        digits[digits.length-1]= pre_sum%10;
        int update = pre_sum/10;
        for ( int i = digits.length - 2; i >= 0; --i ) {
            int sum = digits[i]+update;
            digits[i] = sum%10;
            update = sum/10;
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

// public int[] plusOne(int[] digits) {
        
//     int n = digits.length;
//     for(int i=n-1; i>=0; i--) {
//         if(digits[i] < 9) {
//             digits[i]++;
//             return digits;
//         }
        
//         digits[i] = 0;
//     }
    
//     int[] newNumber = new int [n+1];
//     newNumber[0] = 1;
    
//     return newNumber;
// }