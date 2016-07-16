public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase(); //to lower cases
        StringBuilder result = new StringBuilder();
        for ( int i = 0; i < s.length(); ++i ) {
            if ( Character.isLetterOrDigit(s[i]) ) {
                result.append(s[i]);
            }
        }
        String copy = result.toString();
        int array_length = copy.length();
        for ( int i = 0; i < array_length/2; ++i ) {
            if ( result[i].equals(result[array_length - 1 - i]) ){
                return false;
            }
        }
        return true;
    }
}