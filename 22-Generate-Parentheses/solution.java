public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if ( n <= 0 ) {return result;}
        helper( result, "", 0, 0, n);
        return result;
    }
    public void helper( List<String> result, String curr, int left, int right, int n ) {
        if ( curr.length() == n*2 ) {
            result.add(curr);
            return;
        }
        if ( left < n ) {
            helper( result, curr+"(", left + 1, right, n );
        }
        if ( right < left ) {
            helper( result, curr+")", left, right+1, n);
        }
    }
}