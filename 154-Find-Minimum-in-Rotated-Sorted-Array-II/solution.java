public class Solution {
    public int findMin(int[] nums) {
        if ( nums.size() == 1 ) {
            return nums[0];
        }
        for (int i = 1; i < nums.size(); ) {
            if (nums[i] >= nums[i - 1]) {
                ++i;
            }
            else{
                return nums[i];
            }
        }
    }
}