public class Solution {
    public int jump(int[] nums) {
        int last_index = 0;
        int step = 0;
        int curr = 0;
        if (nums.length==1) {return 0;}
        for ( int i = 0; i < nums.length-1; ++i ) {
           curr = Math.max( curr, i + nums[i] );
           if (i == last_index) {
               step++;
               last_index = curr;
           }
        }
        return step;
    }
}