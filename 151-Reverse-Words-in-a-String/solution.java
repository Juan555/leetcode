public class Solution {
    public String reverseWords(String s) {
        if ( s == null || s.length() == 0 ) {return "";}//new bug!!!! remember to use .equals to compare string
        s = s.trim();
        String[] words = s.split(" ");
        String result = "";
        for ( int i = 0; i < words.length; ++i ) {
            if (!words[i].equals("")){
                 result = words[i] + " " + result;
            }
        }
        result = result.trim();
        return result;
    }
}