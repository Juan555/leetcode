public class Solution {
    public int findMin(int[] nums) {
        if ( nums.length == 1 ) {
            return nums[0];
        }
        return Binary_search( 0, nums.length - 1, int[] nums );
    }
    
    public static int Binary_search( int left, int right, int[] nums ) {
        if ( nums[left] <= nums[right] ) {
            return nums[0];
        }
        int mid = ( left + right ) / 2;
        if ( nums[mid] < nums[left] ) {
            return mid;
        }
        else if ( nums[mid] < nums[left] && nums[mid] < nums[right] ) {
            return Binary_search ( mid + 1, right, int[] nums );
        }
        else {
            return Binary_search ( left, mid - 1, int[] nums );
        }
    }
}