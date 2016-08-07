public class Solution {
    public int jump(int[] nums) {
        int max_index = 0;
        int step = 0;
        int curr = 0;
        if (nums.length==1) {return 0;}
        for ( int i = 0; i < nums.length-1; ++i ) {
            
            if ( i >= max_index || curr < max_index;) {
                step++;
            }
            int curr = max_index;
            max_index = Math.max( max_index, i + nums[i]);
           
        }
        return step;
    }
}