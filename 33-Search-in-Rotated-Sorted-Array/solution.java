public class Solution {
    public int search(int[] nums, int target) {
        for ( int i = 0; i < nums; ++i ) {
            if ( nums[i] == target ) {return 1;}
        }
        return -1;
    }
}