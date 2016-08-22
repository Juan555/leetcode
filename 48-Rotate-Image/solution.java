public class Solution {
    public void rotate(int[][] matrix) {
        if ( matrix.length == 0 || matrix[0].length == 0) {return;}
        int[][] helper = new int[matrix.length][matrix[0].length];
        for ( int i = 0; i < matrix.length; ++i ) {
            for ( int j = 0; j < matrix[0].length; ++j ) {
                helper[i][j] = matrix[i][j];
            }
        }
        for ( int i = 0; i < matrix.length; ++i ) {
            for ( int j = 0; j < matrix[0].length; ++j ) {
                matrix[i][j] = matrix[j][matrix.length - i - 1];
            }
        } 
    }
}