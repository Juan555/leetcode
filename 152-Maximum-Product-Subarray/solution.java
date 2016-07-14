public class Solution {
    public int maxProduct(int[] nums) {
        if ( nums.length == 1 ){
            return nums[0];
        }
        int result = nums[0];
        for ( int i = 1; i < nums.length; ++i ){
            if ( nums[i] >= 1 and result > 0 ){
                result *= nums[i];
            }
            else if (nums[i] < 0 and result < 0 ){
                result *= nums[i];
            }
        }
        return result;
    }
}