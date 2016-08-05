public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if ( nums == null || nums.length == 0 ) { return result; }
        List<Integer> template = new ArrayList<Integer>();
        back_tracking ( result, nums, template, 0 );
        return result;
    }
    public void back_tracking ( List<List<Integer>> result, int[] nums, List<Integer> template, int index ){
        if ( template.size() == nums.length ) {
            if (!result.contains(template)) {
            result.add( template );}
            return;
        }
        for ( int i = 0; i <= template.size(); ++i ) {
            List<Integer> copy = new ArrayList<Integer>(template);
            copy.add(i, nums[index]);
            if (i > 0 && copy.get(i - 1) == nums[index] ) {
                continue;
            }
            back_tracking( result, nums, copy, index + 1);
        }
    }
}