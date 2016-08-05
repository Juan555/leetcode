public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if ( nums == null || nums.size() == 0 ) { return result; }
        List<Integer> template = new ArrayList<Integer>();
        back_tracking( result, nums, template, 0 );
        return result;
    }
    public void back_tracking( List<List<Integer>> result, int[] nums, List<Integer> template, int index ) {
        if ( template.size() == nums.length ) { 
            result.add(template); 
            return;
        }
        for ( int i = 0; i <= template.size(); ++i ) {
            List<Integer> copy = new ArrayList<Integer>(template);
            copy.add(i, nums[index]);
            back_tracking( result, nums, copy, index + 1);
        }
        
    }
}