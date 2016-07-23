public class Solution {
    public double myPow(double x, int n) {
        
        if ( x == 0 ) { return 0;}
        if ( n < 0 ) {
            x = 1/x;
            n =  Math.abs(n);
        }
        if ( n == 0 ) { return 1;}
        double result = x;
        while ( n > 1 ) {
            result *= x;
            n--;
        }
        return result;
    }
}