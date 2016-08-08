public class Solution {
    public int maxSubArray(int[] nums) {
        if ( nums == null || nums.length == 0 ) {return 0;}
        int total_sum = nums[0];
        for ( int i = 0; i < nums.length; ++i ) {
            int sum = nums[i];
            int max = sum;
            for ( int j = i+1; j < nums.length; ++j ) {
                sum += nums[j];
                max = Math.max(max, sum);
            }
            total_sum = Math.max(total_sum, max);
        }
        return total_sum;
    }
}