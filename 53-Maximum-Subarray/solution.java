public class Solution {
    public int maxSubArray(int[] nums) {//potential bug
        if ( nums == null || nums.length == 0 ) {return 0;}
        int max = nums[0];
        int curr_max = max;
        for ( int i = 1; i < nums.length; ++i ) {
            curr_max = Math.max( curr_max + nums[i], nums[i] );
            max = Math.max( max, curr_max);
        }
        return max;
    }
}