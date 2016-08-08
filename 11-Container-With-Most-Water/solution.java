public class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int curr = 0;
        int start = 0;
        int end = height.length - 1;
        while ( start < end ) {
            curr = Math.min( height[start], height[end] ) * ( end - start );
            result = Math.max( curr, result );
            if ( height[start] < height[end] ) {
                start++;
            }
            else {
                end--;
            }
        }
        return result;
    }
}