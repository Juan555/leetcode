public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        int store = 1;
        for ( int i = 0; i < nums.length; ++i ) {
            result[i] = store;
            store *= nums[i];
        }
        int second_store = 1;
        for ( int i = nums.length - 1; i >= 0; --i ) {
            result[i] *= second_store;
            second_store *= nums[i];
        }
        return result;
    }
}