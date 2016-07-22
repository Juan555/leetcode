public class Solution {
    public String countAndSay(int n) { // bug:first generation is itself
        String result = "1";
        int i = 1;
        while ( i < n ) {
            result = count_helper ( result );
            i++;
        }
        return result;
    }
    public String count_helper ( String input ) {
        StringBuilder output = new StringBuilder();
        int length = input.length();
        int total_count = 0;
        
        while ( total_count < length ) {
            int count = 1;
            while ( total_count + count < length  && input.charAt(total_count) == input.charAt(total_count + count) ) {
                count++;
            }
            
            output.append( Integer.toString(count)  );
            output.addpend(Integer.toString(input.charAt(total_count)));
            total_count += count;
            
        }
        return output.toString();
    }
}