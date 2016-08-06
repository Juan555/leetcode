public class Solution {
    public int mySqrt(int x) {
        if ( x < 4 ) {
            return (x == 0)?0:1;
        }
    int left = 1, right = x;
    while(left < right) {
        int mid = left + (right-left) / 2;
        if(mid <= x / mid) {
            left = mid+1;
        } else {
            right = mid;
        }
    }
    return left-1;
    }
}