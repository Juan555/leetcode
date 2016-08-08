public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int min = INT_MAX;
        int max = 0;
        for ( int i = 0; i < triangle.size(); ++i ) {
            for ( int j = 0; j < triangle.get(i).size(); ++j ) {
                min = Math.min( triangle.get(i).get(j), min ); 
            }
            max += min;
            min = INT_MAX;
        }
        return max;
    }
}