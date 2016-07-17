public class Solution {
    public static int findMin(int[] nums) {
        if ( nums.length == 1 ) {
            return nums[0];
        }
        return binarySearch( 0, nums.length - 1, int[] nums );
    }
    
    public static int binarySearch(int left, int right, int[] nums){
        if(left >= right){
            return nums[left];
        }
        int mid  = ( left + right ) / 2;
        if(mid >= 1 && nums[mid] < nums[mid -1]){
            return nums[(left+right)/2];
        }
        else if(nums[mid] >= nums[left] && nums[mid] >= nums[right]){
            return binarySearch(mid + 1 , right, nums);
        }
        else
            return binarySearch(left, mid - 1, nums);
    }
}