public class Solution {
    public List<String> wordBreak(String s, Set<String> wordDict) {
        List<String> result = new ArrayList<>();
        HashMap<Integer, HashMap<Integer, String>> outmap= new HashMap<Integer, HashMap<Integer, String>>();
        for ( int i = 0; i < s.length(); ++i ) {
            HashMap<Integer, String> innermap = new HashMap<>();
            outmap.put(i, innermap);
            for ( int j = i + 1; j < s.length(); ++j ) {
                if (wordDict.contains(s.substring(i,j) ) ) {
                    innermap.put(j, s.substring(i,j) );
                }
            }
        }
        
        for ( int i = 0; i < s.length(); ++i ) {
            if ( outmap.containsKey(i) && outmap.get(i)!= null ) {
                while ( i < s.length() ) {
                    
                }
            }
        }
    }
}