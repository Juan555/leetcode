public class Solution {
    public boolean canJump(int[] nums) {
        //make sure you understand the question
        // if ( nums == null || nums.length == 1 ) {return true;}
        // int max = 0;
        // for ( int i = 0; i <= max && max < nums.length - 1; ++i ) {
        //     max = Math.max( max, nums[i]+i);
        // }
        // return max >= nums.length-1;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        int max = 0;
        if (nums.length == 1){return true;}
        for ( int i = 0; i < nums.length-1; ++i ) {
            
            max = Math.max( max, i + nums[i]);
            if ( i >= max ) {return false;}
        }
        return true;
    }
}