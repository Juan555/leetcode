public class Solution {
    public int reverse(int x) {
        int result = 0;
        int sign = x>0? 1 : (-1);
        x = x>0? x : (-x);
        while ( x > 0 ) {
            result = result* 10 + x/10;
            x = x%10;
        }
        return result*sign;
    }
}