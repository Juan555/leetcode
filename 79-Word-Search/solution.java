public class Solution {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0) {
            if ( word.length() == 0 ) {return true;}
            else { return false;}
        }
        boolean[][] visited = new boolean[board.length][board[0].length];
        for ( int i = 0; i < board.length; ++i ) {
            for ( int j = 0; j < board[0].length; ++j ) {
                if ( word.charAt(0) == board[i][j] && search( board, word, i, j, visited, 0 ) ) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean search( char[][] board, String word, int i, int j, boolean[][] visited, int index ) {
        //check if the string is alreayd valid, and stop checking
        if ( index == word.length() ) {
            return true;
        }
        //check out of boundry or already visited
        if ( visited[i][j] || i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index) ) {
            return false;
        }
        //recursive back-tracking case
        visited[i][j] = true;
        if ( search( board, word, i + 1, j, visited, index + 1 ) ||
             search( board, word, i - 1, j, visited, index + 1 ) ||
             search( board, word, i, j + 1, visited, index + 1 ) ||
             search( board, word, i, j - 1, visited, index + 1 ) ) {
                 return true;
             }
        visited[i][j] = false;
        return false;
        //reset the invalid path to original state
    }
}