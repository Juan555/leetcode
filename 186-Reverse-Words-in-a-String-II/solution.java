public class Solution {
    public void reverseWords(char[] s) {
        reverse_helper(s, 0, s.length-1);
        int left = 0;
        int right = 0;
        // for ( int i = 0; i < s.length; ++i ) {
        //     if ( i == s.length-1 || i == ' ' ) {
        //         reverse_helper(s, left, right-1);
        //         right = right + 2;
        //         left = right;
        //     }
        //     else{
        //         right++;
        //     }
        // }

		}
    }
    public void reverse_helper(char[]s, int left, int right){
        for ( int i = 0; i <= (right - left)/2; ++i ) {
            char temp = s[right - i];
            s[right - i] = s[left+i];
            s[left+i] = temp;
        }
    }
}