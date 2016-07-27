public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for ( int i = 0; i < length - 2; ++i ) {
            for ( int j = i + 1; j < length - 1; ++j ) {
                for ( int k =  j + 1; k < length; ++k ) {
                    if ( nums[k] == -( nums[i] + nums[j] ) ) {
                        List<Integer> element = new List<Integer>();
                        element.add(nums[i]);
                        element.add(nums[j]);
                        element.add(nums[k]);
                        if ( result.size() != 0 && result[result.size() - 1] == element ) {
                            continue;
                        }
                        else {
                            result.add( element);
                        }
                    }
                }
            }
        }
        return result;
    }
}