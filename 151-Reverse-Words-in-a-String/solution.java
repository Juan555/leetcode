public class Solution {
    public String reverseWords(String s) {
        String word = "";
        String result = "";
        for ( int i = 0; i < s.length; ++i ) {
            if ( s[i] == " "){
                result = word + " " + result;
            }
            else {
                word += s[i];
            }
        }
        return result;
    }
}