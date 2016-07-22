public class Solution {
    public int strStr(String haystack, String needle) {
        int hay_length = haystack.length();
        int need_length = needle.length();
        for ( int i = 0; i <= (hay_length - need_length); ++i ) {
            if ( haystack.subString( i, i + need_length ).equals ( needle ) ) {
                return i;
            }
        }
        return -1;
    }
}