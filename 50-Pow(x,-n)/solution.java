public class Solution {
    public double myPow(double x, int n) { // Time Limit Exceeded 
        return pow(x, n);
    }
    
    private double pow(double x, long n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n < 0) return 1 / pow(x, 0 - n);
        if (n % 2 == 0) return pow(x * x, n / 2);
        else return pow(x * x, n / 2) * x;
    
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