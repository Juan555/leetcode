public class Solution {
    public int numDecodings(String s) {
        char [] s_array = s.toCharArray();
        int [] result = new int[s.length];
        if ( s.length() == 0 ) { return 0;}
        if ( s.length() == 1 ) { return 1;}
        if ( s.length() == 2 ) {
            if ( s[0] == 1 ||(s[0] == 2 && s[1] <= 6 ) ) {return 2;}
            else { return 1; }
        }
        if ( s[0] == 1 ||(s[0] == 2 && s[1] <= 6 ) ) { record[1] = 2; }
        else { record[1] = 1;}
        for ( int i = 2; i < s.length(); ++i ){
            if ( s[i - 1] == 2 ) {
                if ( s[i] > 6 ) { record[i] = record[i - 1];}
                else if  ( s[i - 2] <= 2 ){
                    record[i] = record[i - 1] + record[i - 1]/2 + record[i - 1]%2;
                }
                else{
                   record[i] = 2 * record[i - 1]; 
                }
            }
            else if ( s[i - 1] == 1 ) {
                if ( s[i - 2] <= 2 ) {
                    record[i] = record[i - 1] + record[i - 1]/2 + record[i - 1]%2;
                }
                else {
                    record[i] = 2 * record[i - 1];
                }
            }
            else {
                result[i] = result[i - 1];
            }
        }
        return result[s.length - 1];
    }
}