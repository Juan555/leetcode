public class Solution {
    public static int findMin(int[] nums) {
        if ( nums.length == 1 ) {
            return nums[0];
        }
        return Binary_search( 0, nums.length - 1, nums );
    }
    
    public static int Binary_search( int left, int right, int[] nums ) {
        if ( nums[left] <= nums[right] ) {
            return nums[left];
        }
        int mid = ( left + right ) / 2;
        if ( mid >= 1 && nums[mid] < nums[mid - 1]) {
            return nums[mid];
        }
        else if ( nums[mid] >= nums[left] && nums[mid] >= nums[right] ) {
            return Binary_search ( mid + 1, right, nums );
        }
        else {
            return Binary_search ( left, mid - 1, nums );
        }
    }
}