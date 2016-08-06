public class Solution {
    public double myPow(double x, int n) { // Time Limit Exceeded 
        return power( x, n );
    }
    public double power ( double x, long n ) {
        if ( n == 0 ) {return 1;}
        if ( n < 0 ) { 
            return 1.0/power( x, -n );}
        double v = power ( x, n/2 );
        return (n%2==1? (v * v * x) : (v * v));
    
    // if ( n == 0 ) { return 1;} Time limit
    // if ( n < 0 ) {
    //     x = 1.0/x;
    //     n = -n;
    // }
    // double result = 1.0;
    // for ( int i = 1; i <= n; ++i ) {
    //     result *= x;
    // }
    // return result;
    

    }
}