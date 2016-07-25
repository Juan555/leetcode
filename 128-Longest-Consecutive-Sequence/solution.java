import java.util.Arrays;
public class Solution {
    public int longestConsecutive(int[] nums) {
        if ( nums == null ) { return 0; }
        if ( nums.length == 1 ) { return 1; }
        Arrays.sort( nums );
        int count = 1;
        int max = 1;
        for ( int i = 1; i < nums.length; ++i ) {
            if (nums[i] == (nums[i - 1]+1)) {
                count++;
                if (count > max) { max = count; }
            }
            else if ( nums[i] == nums[i - 1] ) {
                if (count > max) { max = count; }
            }
            else { count = 1;}
        }
        return max;
    }
}