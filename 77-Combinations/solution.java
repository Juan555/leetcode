public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if ( k <= 0 || k > n || n <= 0 ) { return result; }
        List<Integer> template = new ArrayList<Integer>();
        back_tracking( result, n, k, template, 1 );
        return result;
    }
    
    public void back_tracking(List<List<Integer>> result, int n, int k, List<Integer> template, int index) {
        if (template.size() == k ) {
            result.add(new ArrayList<Integer>(template));
            return;
        }
        for ( int i = index; i <= n; ++i ) {
            template.add(i);
            back_tracking(result, n, k, template, i+1);
            template.remove(template.size() - 1 );
        }
    }
}