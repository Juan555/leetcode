
public class Solution {
    public List<String> letterCombinations(String digits) {//need better solution
        HashMap<Character, String> map = new HashMap<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> result = new ArrayList<>();
        if ( digits == null || digits.length() ==0 ) {return result;}
        String element = new String();
        back_tracking( result, digits, element, map, 0 );
        return result;
    }
    public void back_tracking( List<String> result, String digits, String element, HashMap map, int index ) {
        if ( element.length() == digits.length() ) {
            if (!result.contains(element)) {
            result.add(new String(element));}
            return;
        }
        for ( int i = index; i < digits.length(); ++i ) {
            char c = digits.charAt(index);
            String s = (String)map.get(c);
            for ( int j = 0; j < s.length(); ++j ){
                back_tracking( result, digits, element + s.charAt(j), map, index + 1);  
            }
        }
    }
}