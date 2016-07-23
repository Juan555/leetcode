public class Solution {
    public double myPow(double x, int n) {
        double result = x;
        while ( n > 1 ) {
            result *= x;
        }
        return result;
    }
}