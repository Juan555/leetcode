public class Solution {
    public double myPow(double x, int n) { // Time Limit Exceeded 
        if ( n < 0 ) {
            x = 1/x;
            n =  Math.abs(n);
        }
        return power( x, n );
    }
    public double power ( double x, int n ) {
        if ( n == 0 ) return 1;
        double v = power ( x, n/2 );
        return n%2=1? v * v * x : v * v;
    }
}