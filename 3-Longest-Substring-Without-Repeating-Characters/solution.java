public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        if ( s.length() < 1 ) {return result;}
        HashMap<String, Integer> map = new HashMap<>();
        String last_substring = "";
        for (int i = 0; i < s.length(); ++i ) {
            String element = "" + s.charAt(i);
            if (!last_substring.contains(element) ) {
                map.put( element, i);
                last_substring += element;
                result = Math.max ( result, last_substring.length() );
            }
            else {
                int diff = i - map.get(element);
                result = Math.max ( result, diff );
                last_substring = s.substring(map.get(element),i);
                map.put(element, i);
            }
        }
        return result;
    }
}