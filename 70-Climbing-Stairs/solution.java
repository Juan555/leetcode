public class Solution {
    public int climbStairs(int n) {
        if ( n <= 3 ){
            return n;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i < result.length; ++i){
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }
}