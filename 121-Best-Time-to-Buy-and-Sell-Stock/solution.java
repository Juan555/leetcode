public class Solution {
    public int maxProfit(int[] prices) {
        // if ( prices.length <= 1 ) {return 0;}
        // int[] max = new int[prices.length - 1];
        // max[max.length - 1] = prices[prices.length - 1];
        // for ( int i = max.length - 1; i > 0; --i ) {
        //     if ( prices[i] > max[i] ) {
        //         max[i-1] = prices[i];
        //     }
        //     else { max[i-1] = max[i];}
        // }
        // int result = 0;
        // for ( int i = 0; i < prices.length - 1; ++i ) {
        //     int diff = max[i] - prices[i];
        //     if ( diff >  result ) { 
        //         result = diff;
        //     }
        // }
        // return result;
        
        //Time exceeded
        // int result = 0;
        // for ( int i = 0; i < prices.length-1; ++i ) {
        //     for ( int j = i; j < prices.length; ++j ) {
        //         result = Math.max ( result, prices[j] - prices[i] );
        //     }
        // }
        // return result;
        int result = 0;
        if ( prices == null ||prices.length == 0 ) {return result;}
        int min = prices[0];
        for ( int i = 1; i < prices.length; ++i ) {
            result = Math.max( result, prices[i] - min );
            min = Math.min( min, prices[i] );
        }
        return result;
    }
}