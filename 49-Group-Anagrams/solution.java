public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if ( strs == null || strs.length == 0 ) {return new ArrayList<List<String>>();}
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for ( int i = 0; i < strs.length; ++i ) {
            char[] ca = strs[i].toCharArray();
            Array.sort(ca);
            String key = String.valueOf(ca);
            if ( !map.containsKey(key) ) {
                map.put(key, new ArrayList<String>() );
            }
            map.get(key).add(strs[i]);
        }
        return new ArrayList<List<String>>(map.values() );
        
    }
}