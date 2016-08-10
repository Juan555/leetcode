public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        boolean [] result = new boolean[s.length() + 1];
        if ( (s.length() == 1 && wordDict.contains(s)) || s.length() < 1){return true;}
        result[0] = true;
        for ( int i = 1; i <= s.length(); ++i ) {
            for ( int j = 0; j < i; ++j ) {
                if ( result[j] && wordDict.contains(s.substring(j, i)) ){
                    result[i] = true;
                }
            }
        }
        return result[s.length()];
    }
}