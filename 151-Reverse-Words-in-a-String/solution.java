public class Solution {
    public String reverseWords(String s) {
        String word = "";
        String result = "";
        for ( int i = 0; i < s.length(); ++i ) {
            char c = s.charAt(i);
            if ( c == ' '){
                result = word + " " + result;
            }
            else {
                word.append(c);
            }
        }
        return result;
    }
}