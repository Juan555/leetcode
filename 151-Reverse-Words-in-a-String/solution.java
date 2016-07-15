public class Solution {
    public String reverseWords(String s) {
        if ( s == null || s.length() == 0 ) {
            return "";
        }
        if ( s.charAt(0) == ' ' ) {
            return "";
        }
        String word = "";
        String result = "";
        for ( int i = 0; i < s.length(); ++i ) {
            char c = s.charAt(i);
            if ( c == ' '){
                result = word + " " + result;
                word = "";
            }
            else {
                word += c;
            }
        }
        return result;
    }
}