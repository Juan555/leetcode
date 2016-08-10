public class Solution {
    public int maximalSquare(char[][] matrix) {
        int result = 0;
        if ( matrix.length == 0 || matrix[0].length == 0) {return 0;}
        int [][] map = new int[matrix.length + 1][matrix[0].length + 1];
        for ( int i = 1; i <= matrix.length; ++i ) {
            for ( int j = 1; j <= matrix[0].length; ++j ) {
                if ( matrix[i-1][j-1] == '1' ) {
                    map[i][j] = Math.min(Math.min ( map[i - 1][j], map[i][j - 1]), map[i - 1][j - 1] ) + 1;
                    result = Math.max( result, map[i][j]);
                }
            }
        }
        return result*result;
    }
}