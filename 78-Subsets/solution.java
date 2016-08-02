public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int total_number = 1 << nums.length;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for ( int i = 0; i < total_number; ++i ) {
            List<Integer> set = new ArrayList<>();
            for ( int j = 0; j < nums.length; ++j ) {
                if ((i & (1<<j)) != 0) { set.add(nums[j]);}
            }
            result.add(set);
        }
        return result;
    }
}