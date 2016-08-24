public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if ( strs == null || strs.length() == 0 ) {return new List<List<String>>();}
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for ( int i = 0; i < strs.length; ++i ) {
            char[] ca = strs[i].toCharArray();
            String.sort(ca);
            String key = String.valueOf(ca);
            if ( map.containsKey(key) ) {
                map.get(key).add(strs[i]);
            }
            else{map.put(key, strs[i]);}
        }
        return new List<List<String>>(map.values() );
        
    }
}