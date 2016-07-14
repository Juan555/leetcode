public class Solution {
    public int maxProduct(int[] nums) {
        int preMax = nums[0];
        int preMin = nums[0];
        int result = nums[0];
        for ( int i = 1; i < nums.length; ++i ){
            preMax = max ( max(preMax * nums[i], preMin * nums[i]), nums[i] );
            preMin = min ( min(preMin * nums[i], preMin * nums[i]), nums[i] );
            result = max ( preMax, result );
        }
        return result;
    }
}