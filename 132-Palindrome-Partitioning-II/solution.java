public class Solution {
    public int minCut(String s) {
        int length = s.length();
        if ( length == 0 ) { return 0; }
        boolean [][] judge = new boolean[length][length];
        for ( int i = 0; i < length; ++i ) {
            for ( int j = 0; j < length; ++j ) {
                judge[i][j] = false;
            }
        }
        int [] cut = new int[length + 1];
        for ( int i: cut ) { cut[i] = length - i - 1;} //max cut for each cell
        for ( int i = length - 1; i >= 0; --i ) {
            for ( int j = i; j < length; ++j ) {
                if ( s.get(i) == s.get(j) && (j - i < 2 || judge[i + 1][j - 1]) ){
                    judge[i][j] = true;
                    cut[i] = Math.min( cut[i], cut[i + 1] + 1);
                }
            }
        }
        return cut[0];
        
        
    }
}