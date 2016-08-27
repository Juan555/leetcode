public class Solution {
    public void reverseWords(char[] s) {//我的妈啊，全是bug
        reverse_helper(s, 0, s.length-1);
        int left = 0;
        for ( int i = 0; i <= s.length; ++i ) {
            if ( i == s.length || s[i] == ' ' ) {
                reverse_helper(s, left, i-1);
                left = i+1;
            }
        }
//         for(int i = 0, j = 0;i <= s.length;i++){
// 			if(i==s.length || s[i] == ' '){
// 				reverse_helper(s,j,i-1);
// 				j = i+1;
// 			}
// 		}
    }
    public void reverse_helper(char[]s, int left, int right){
        if ( right> left ){
        for ( int i = 0; i <= (right - left)/2; ++i ) {
            char temp = s[right - i];
            s[right - i] = s[left+i];
            s[left+i] = temp;
        }
        }
    }
}