public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int max = 0;
        for ( int i = triangle.size() - 2; i >= 0; --i ){
            for ( int j = 0; j < triangle.get(i).size() - 1; ++j ){
                triangle[i][j] = Math.min( triangle.get(i+1).get(j), triangle.get(i+1).get(j+1) ) + triangle[i][j];
            }
        }
        return max;
    }
}