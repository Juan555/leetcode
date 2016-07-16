public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase(); //to lower cases
        StringBuilder result = new StringBuilder();
        for ( int i = 0; i < s.length(); ++i ) {
            if ( Character.isLetterOrDigit(s.charAt(i)) ) {
                result.append(s.charAt(i));
            }
        }
        String copy = result.toString().toLowerCase();
        int array_length = copy.length();
        for ( int i = 0; i < array_length/2; ++i ) {
            if ( copy.charAt(i)!=copy.charAt(array_length - 1 - i) ){
                return false;
            }
        }
        return true;
    }
}