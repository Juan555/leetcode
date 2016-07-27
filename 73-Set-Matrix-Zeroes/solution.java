public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean first_column = false;
        int row = matrix.length;
        int column = matrix[0].length;
        for ( int i = 0; i < row; ++i ) {
            if ( matrix[i][0] == 0 ) { first_column = true; }
            for ( int j = 1; j < column; ++j ) {
                if ( matrix[i][j] == 0 ) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        for ( int i = row - 1; i >= 0; --i ){
            for ( int j = column - 1; j >= 1; --j ){
                if ( matrix[i][0] == 0 || matrix[0][j] == 0 ) {
                    matrix[i][j] = 0;
                }
            }
            if ( first_column == true) {
                    matrix[i][0] = 0;
                }
        }
    }
}