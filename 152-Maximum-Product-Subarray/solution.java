public class Solution {
    public int maxProduct(int[] nums) {
        int preMax = nums[0];
        int preMin = nums[0];
        int result = nums[0];
        for ( int i = 1; i < nums.length; ++i ){
            int currMax = Math.max ( Math.max(preMax * nums[i], preMin * nums[i]), nums[i] );
            int currMin = Math.min ( Math.min(preMin * nums[i], preMin * nums[i]), nums[i] );
            preMath = currMax;
            preMin = currMin;
            result = Math.max ( preMax, result );
        }
        return result;
    }
}