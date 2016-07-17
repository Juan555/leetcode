public class Solution {
    public int findMin(int[] nums) {
        if ( nums.length == 1 ) {
            return nums[0];
        }
        for (int i = 1; i < nums.length; ) {
            if (nums[i] >= nums[i - 1]) {
                ++i;
            }
            else{
                return nums[i];
            }
        }
        return nums[0];
    }
}