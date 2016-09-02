public class Solution {
    public boolean isPalindrome(int x) {
        if ( x < 0 ) {return false;}
        int first= x;
        int second = 0;
        int end = x;
        while( end > 0 ) {
            second = second * 10 + first%10;
            first /= 10;
            end /= 100;
        }
        return (first == second)||(second/10 == first);
    }
}