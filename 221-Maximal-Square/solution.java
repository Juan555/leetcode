public class Solution {
    public int maximalSquare(char[][] matrix) {
        int result = 0;
        if ( matrix.length == 0 || matrix[0].length == 0) {return 0;}
        for ( int i = 1; i < matrix.length; ++i ) {
            for ( int j = 1; j < matrix[0].length; ++j ) {
                if ( matrix[i][j] == 1 ) {
                    matrix[i][j] = Math.min(Math.min ( matrix[i - 1][j], matrix[i][j - 1]), matrix[i - 1][j - 1] ) + 1;
                    result = Math.max( result, matrix[i][j])
                }
            }
        }
        return result;
    }
}