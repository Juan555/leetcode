public class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        if ( prices == null || prices.length == 1 ) {return result;}
        for ( int i = 1; i < prices.length; ++i ) {
            if ( prices[i] > prices[i - 1] ) {
                result += prices[i] - prices[i - 1];
            }
        }
        return result;
    }
}