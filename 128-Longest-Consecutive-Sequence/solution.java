import java.util.Arrays
public class Solution {
    public int longestConsecutive(int[] nums) {
        if ( nums == null ) { return 0; }
        if ( nums.length == 1 ) { return 1; }
        Arrays.sort( nums );
        int count = 0;
        int max = 0;
        for ( int i = 1; i < nums.length; ++i ) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count > max) { max = count; }
            }
            else { count = 0;}
        }
        return max;
    }
}