public class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Integer, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> result = new ArrayList<>();
        String element = new String();
        back_tracking( result, digits, 0 );
    }
    public void back_tracking( List<String> result, String digits, String element, int index ) {
        if ( element.length() == digits.length() ) {
            result.add(element);
            return;
        }
        for ( int i = 0; i < digits.length(); ++i ) {
            char c = digits.charAt(i);
            element += c;
            back_tracking( result, digits, element, index + 1);   
        }
    }
}