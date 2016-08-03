public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int total_number = 1<<nums.length;
        for (int i = 0; i < total_number; ++i ) {
            List<Integer> subset = new ArrayList<Integer>();
            for ( int j = 0; j < nums.length; ++j ) {
                if (( i>>j ) & 1 == 1) { subset.add(nums[j]); }
            }
            if ( !result.contains(subset) ) { result.add(subset); }
        }
        return result;
    }
}