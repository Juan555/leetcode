public class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if ( nums == null || length == 0 ) {return 0;}
        if ( length == 1 ) {return nums[0];}
        if ( length == 2 ) {return Math.max(nums[0], nums[1]);}
        int [] record = new int[nums.length];
        record[0] = nums[0];
        record[1] = Math.max( nums[0], nums[1]);
        for ( int i = 2; i < length; ++i ) {
          record[i] = Math.max( record[i - 1], record[i - 2] + nums[i]); 
        }
        return record[length - 1];
    }
}