// import java.util.Arrays;
import java.util.HashMap;
public class Solution {
    public int longestConsecutive(int[] num) {//bug for [0,0] and count = 1
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
        int res = 0;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int n : num) {
        if (!map.containsKey(n)) {
            int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
            int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
            // sum: length of the sequence n is in
            int sum = left + right + 1;
            map.put(n, sum);
            
            // keep track of the max length 
            res = Math.max(res, sum);
            
            // extend the length to the boundary(s)
            // of the sequence
            // will do nothing if n has no neighbors
            map.put(n - left, sum);
            map.put(n + right, sum);
        }
        else {
            // duplicates
            continue;
        }
    }
    return res;
    }
}