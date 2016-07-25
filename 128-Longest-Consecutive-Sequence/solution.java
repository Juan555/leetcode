// import java.util.Arrays;
import java.util.HashMap;
public class Solution {
    public int longestConsecutive(int[] nums) {//bug for [0,0] and count = 1
        // if ( nums == null ) { return 0; } O(nlogn)
        // if ( nums.length == 1 ) { return 1; }
        // Arrays.sort( nums );
        // int count = 1;
        // int max = 1;
        // for ( int i = 1; i < nums.length; ++i ) {
        //     if (nums[i] == (nums[i - 1]+1)) {
        //         count++;
        //         if (count > max) { max = count; }
        //     }
        //     else if ( nums[i] == nums[i - 1] ) {
        //         if (count > max) { max = count; }
        //     }
        //     else { count = 1;}
        // }
        // return max;
        
        //create a map to store the number of consecutive elements
        Map<Integer, Integer> map = new HashMap<>();
        if ( nums == null ) { return 0; } O(nlogn)
        if ( nums.length == 1 ) { return 1; }
        int result = 1;
        for ( int i: nums ) {
            //1.check if reocurr, if yes:continue, if not--> 2.check before and after exists, if yes, check it's continued length; if not, set its length to 0-->3.add up before and after and itself-->4compare max and sum,update-->5.set the new sequence's head and tail's length to the new sum
            if ( !map.containsKey(i) ) {
                int left = map.containsKey(i - 1)? map.get(i - 1) : 0;
                int right = map.containsKey(i + 1)? map.get(i + 1) : 0;
                int sum = left + right + 1;
                result = Math.max ( sum, result );
                map.put( i - left, sum);
                map.put( i + right, sum);
            }
            else { continue; }
        }
        return result;
    }
}