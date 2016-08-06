public class Solution {
    public double myPow(double x, int n) { // Time Limit Exceeded 
        if(n == 0)
            return 1;
        
        if(n == 1)
            return x;
        
        if(n == -1)
            return 1/x;

        double num = myPow(x, n/2);       
        return num * num * myPow(x, n%2); 
    
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