public class Solution {
    public void sortColors(int[] nums) {
        // int red = 0;
        // int white = 0;
        // int blue = 0;
        // for ( int i = 0; i < nums.length; ++i ){
        //     if ( nums[i] == 0 ) {red ++;}
        //     else if ( nums[i] == 1 ) {white++;}
        //     else{blue++;}
        // }
        // for ( int i = 0; i < nums.length; ++i ) {
        //     if ( i <= red - 1 ) {nums[i] = 0;}
        //     else if ( i <= (red + white - 1) ) {nums[i] = 1;}
        //     else {nums[i] = 2;}
        // }
        // return;
        int j = 0, k = nums.length-1;
        for (int i=0; i <= k; i++) {
        if (nums[i] == 0)｛
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j++] = temp;
            }
        else if (nums[i] == 2) ｛
            int second_temp = nums[i];
            nums[i--] = nums[k];
            nums[k--] = second_temp;
            }
        }
    }
}