public class Solution {
    public int numIslands(char[][] grid) {
        int result = 0;
        if ( grid.length == 0 || grid[0].length == 0 ) {return result;}
        boolean[][] judge = new boolean[grid.length][grid[0].length];
        for ( int i = 0; i < grid.length; ++i ) {
            for ( int j = 0; j < grid[0].length; ++j ) {
                if ( judge[i][j] == false && grid[i][j] == '1' ) {
                    map(judge, grid, i, j);
                    result++;
                }
                else{continue;}
            }
        }
        return result;
    }
    public void map ( boolean[][] judge, char[][] grid, int i, int j ) {
        if ( i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || judge[i][j] || grid[i][j] != '1') {
            return;
        }
        else {
            judge[i][j] = true;
            map( judge, grid, i-1, j );
            map( judge, grid, i+1, j );
            map( judge, grid, i, j+1 );
            map( judge, grid, i, j-1 );
        }
    }
}