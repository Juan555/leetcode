public class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for ( Integer i: nums ) {
            if ( !map.containsKey(i) ) { map.put(i, 1);}
            else { map.put(i, 2);}
        }
        for ( Integer i: nums ) {
            if ( map.get(i) == 1 ) { return i;}
        }
        return 0;
    }
}