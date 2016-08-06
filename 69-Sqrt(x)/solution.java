public class Solution {
    public int mySqrt(int x) {
        return helper( x, x/2 );
    }
    public int helper( int x, int result ){
        if ( (result * result <= x) && ((result + 1) * (result + 1) > x)) {
            return result;
        }
        if ( result * result > x ){
            result = 
        }
        else {
            result = 3*result/2;
        }
    }
}