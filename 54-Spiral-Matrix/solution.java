public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //特别容易出bug
        //boolean down_left = true;
        //List<Integer> result = new ArrayList<>();
        // if ( matrix.length == 0 || matrix[0].length == 0 ){return result;}
        // int width = matrix[0].length;
        // int height = matrix.length;
        // for ( int i = 0; i < matrix[0].length; ++i ) {
        //     result.add(matrix[0][i]);
        // }
        // while( width > 0 && height >0 ){
        //     if ( down_left ) {
        //         //going down
        //         for ( int i = matrix.length-height-1; i < height; ++i ) {
        //             result.add(matrix[width-1][i]);
        //         }
        //         //going left
        //         for ( int j = width-1; j >= 0; --j ){
        //             result.add(matrix[j][height-1]);
        //         }
        //     }
        //     else{
        //         //going up
        //         for ( int i = height - 1; i > matrix.length-height-1; --i ) {
        //             result.add(matrix[i][]);
        //         }
        //         //going right
                
        //     }
        //     width--;
        //     height--;
        //     down_left = !down_left;
        // }
        // return result;
        List<Integer> result = new ArrayList<>();
        if ( matrix.length == 0 || matrix[0].length == 0 ){return result;}
        int col_begin = 0;
        int row_begin = 0;
        int col_end = matrix[0].length - 1;
        int row_end = matrix.length - 1;
        while ( col_begin <= col_end && row_begin <= row_end ) {
            //going right
            for ( int i = col_begin; i <= col_end; ++i ) {
                result.add(matrix[row_begin][i]);
            }
            row_begin++;
            //going down
            for ( int i = row_begin; i <= row_end; ++i ) {
                result.add(matrix[i][col_end]);
            }
            col_end--;
            //going left
            if ( row_begin <= row_end ) {
                for (int i = col_end; i >= col_begin; --i ){
                    result.add(matrix[row_end][i]);
                }
               row_end--; 
            }
            
            //going up
            if ( col_begin <= col_end ) {
            for ( int i = row_end; i >= row_begin; --i ) {
                result.add(matrix[i][col_begin]);
            }
            col_begin ++;
            }
        }
        return result;
    }
}