public class Solution {
    public void gameOfLife(int[][] board) {
        // if ( board.length == 0 || board[0].length == 0 ) {return;}
        // int[][] result = new int[board.length][board[0].length];
        // for ( int i = 0; i < board.length; ++i ) {
        //     for ( int j = 0; j < board[0].length; ++j ) {
        //         result[i][j] = board[i][j];
        //     }
        // }
        // for ( int i = 0; i < board.length; ++i ) {
        //     for ( int j = 0; j < board[0].length; ++j ) {
        //         int sum = 0;
        //         if ( j - 1 >= 0 ) { sum += result[i][j - 1];
        //             if ( i - 1 >= 0 ) { sum += result[i - 1][j - 1];}
        //             if ( i + 1 < board.length ) { sum += result[i + 1][j - 1];}
        //         }
        //         if ( j + 1 < board[0].length ) {sum += result[i][j + 1];
        //             if ( i - 1 >= 0 ) { sum += result[i - 1][j + 1];}
        //             if ( i + 1 < board.length ) { sum += result[i + 1][j + 1];}
        //         }
        //         if ( i - 1 >= 0 ) { sum += result[i - 1][j];
        //         }
        //         if ( i + 1 < board.length ) { sum += result[i + 1][j];
        //         }
        //         if ( sum < 2 ) { board[i][j] = 0;}
        //         else if ( sum == 3 ) {board[i][j] = 1;}
        //         else if ( result[i][j] == 1 && sum == 2 ) {board[i][j] = 1; }
        //         else {board[i][j] = 0;}
        //     }
        // }
        if ( board.length == 0 || board[0].length == 0 ) {return;}
        int width = board[0].length;
        int height = board.length;
        for ( int i = 0; i < board.length; ++i ) {
            for ( int j = 0; j < board[0].length; ++i ) {
              int sum = check_result( board, i, j, width, height); 
              if (board[i][j] == 0 &&  sum == 3) {board[i][j] = 2;}
              if ( board[i][j] == 1 && (sum <2 || sum >3) {board[i][j] = 1;}
            }
        }
        for ( int i = 0; i < board.length; ++i ) {
            for ( int j = 0; j < board[0].length; ++i ) {
              board[i][j] >> 1;
            }
        }
    }
    public int check_result( int[][] board, int i, int j, int width, int heigth ) {
        int sum = 0;
        for ( int row = Math.max(i - 1, 0); row <= Math.min(i+1, height-1); i++ ){
            for ( int col = Math.max(j - 1, 0); col <= Math.min(j+1, width-1); j++ ){
                sum += board[i][j]&1;
            }
        }
        return sum;
    }
}