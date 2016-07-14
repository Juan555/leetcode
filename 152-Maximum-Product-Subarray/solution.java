public class Solution {
    public int maxProduct(int[] nums) {
        int preMax = nums[0];
        int preMin = nums[0];
        int result = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
        for ( int i = 1; i < nums.length; ++i ){
            currMax = Math.max ( Math.max(preMax * nums[i], preMin * nums[i]), nums[i] );
            currMin = Math.min ( Math.min(preMin * nums[i], preMin * nums[i]), nums[i] );
            preMax = currMax;
            preMin = currMin;
            result = Math.max ( preMax, result );
        }
        return result;
    }
}