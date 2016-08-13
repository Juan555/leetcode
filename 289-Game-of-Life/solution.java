public class Solution {
    public void gameOfLife(int[][] board) {
        if ( board.length == 0 || board[0].length == 0 ) {return;}
        int[][] result = new int[board.length][board[0].length];
        for ( int i = 0; i < board.length; ++i ) {
            for ( int j = 0; j < board[0].length; ++j ) {
                result[i][j] = board[i][j];
            }
        }
        for ( int i = 0; i < board.length; ++i ) {
            for ( int j = 0; j < board[0].length; ++j ) {
                int sum = 0;
                if ( j - 1 >= 0 ) { sum += result[i][j - 1];
                    if ( i - 1 >= 0 ) { sum += result[i - 1][j - 1];}
                    if ( i + 1 < board.length ) { sum += result[1 + 1][j - 1];}
                }
                if ( j + 1 < board[0].length ) {sum += result[i][j + 1];
                    if ( i - 1 >= 0 ) { sum += result[i - 1][j + 1];}
                    if ( i + 1 < board.length ) { sum += result[1 + 1][j + 1];}
                }
                if ( i - 1 >= 0 ) { sum += result[i - 1][j];
                    if ( j - 1 >= 0 ) { sum += result[i - 1][j - 1];}
                    if ( j + 1 < board[0].length ) {sum += result[i - 1][j + 1];}
                }
                if ( i + 1 < board.length ) { sum += result[1 + 1][j];
                    if ( j - 1 >= 0 ) { sum += result[i + 1][j - 1];}
                    if ( j + 1 < board[0].length ) {sum += result[i + 1][j + 1];}
                }
                if ( sum < 2 ) { board[i][j] = 0;}
                else if ( sum == 3 ) {board[i][j] = 1;}
                else if ( result[i][j] == 1 && sum == 2 ) {board[i][j] = 1; }
                else {board[i][j] = 0;}
            }
        }
    }
}