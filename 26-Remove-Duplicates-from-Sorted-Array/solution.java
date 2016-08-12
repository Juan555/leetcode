public class Solution {
    public int removeDuplicates(int[] nums) {
        int result = nums.length;
        for ( int i = 0; i < nums.length-1; ++i ) {
            for ( int j = i + 1; j < nums.length; ++j ) {
                if ( nums[j] == nums[i] ) {
                    result--;
                }
            }
        }
        return result;
    }
}