public class Solution {
    public int maxProfit(int[] prices) {
        if ( prices.length <= 1 ) {return 0;}
        int[] max = new int[prices.length - 1];
        max[max.length - 1] = prices[prices.length - 1];
        for ( int i = max.length - 1; i > 0; --i ) {
            if ( prices[i] > max[i] ) {
                max[i] = prices[i];
            }
            else { max[i] = max[i + 1];}
        }
        int result = 0;
        for ( int i = 0; i < prices.length - 1; ++i ) {
            int diff = max[i] - prices[i];
            if ( diff >  result ) { 
                result = diff;
            }
        }
        return result;
    }
}