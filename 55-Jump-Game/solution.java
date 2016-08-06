public class Solution {
    public boolean canJump(int[] nums) {
        if ( nums.length ==1 ) {return true;}
        for ( int i = 0; i < nums.length; ) {
            if ( i + nums[i] == (nums.length-1) ) {return true;}
            else if ( i + nums[i] >=nums.length) { return true;}
            else if (nums[i] == 0) {return false;}
            else { i = i + nums[i]-1; }
        }
        return false;
    }
}