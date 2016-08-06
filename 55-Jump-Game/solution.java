public class Solution {
    public boolean canJump(int[] nums) {
        for ( int i = 0; i < nums.length; ) {
            if ( i + nums[i] >= nums.length) { return false;}
            else { i = i + nums[i]; }
        }
        return true;
    }
}