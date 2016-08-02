public class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for ( int i = 0; i < heights.length; ++i ) {
            int curr = heights[i];
            int count = 1;
            max = Math.max( max, curr );
            for ( int j = i + 1; j < heights.length; ++j ) {
                if ( heights[j] >= curr ) { count++; }
                else { break; }
            }
            for ( int k = i - 1; k >= 0; --k ) {
                if ( heights[k] >= curr ) { count++; }
                else { break; }
            }
            max = Math.max( max, curr*count );
        }
        return max;
    }
}