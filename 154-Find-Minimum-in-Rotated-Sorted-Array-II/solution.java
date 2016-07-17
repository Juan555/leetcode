public class Solution {
    public int findMin(int[] num) {
    //     if ( nums.length == 1 ) {
    //         return nums[0];
    //     }
    //     return binary_search( 0, nums.length - 1, nums );
    // }
    
    // public int binary_search ( int left, int right, int[] nums ) {
    //     if (left == right) {
    //         return nums[left];
    //     }
    //     if ( left < right && nums[left] == nums[right] ) {
    //         return binary_search ( left + 1, right, nums );
    //     }
    //     if (nums[left] < nums[right] ) {
    //         return nums[left];
    //     }
        
    //     int mid = ( left + right ) / 2;
    //     if ( nums[left] == nums[left + 1] ) {
    //         return binary_search ( left + 1, right, nums );
    //     }
    //     if ( nums[right] == nums[right - 1] ) {
    //         return binary_search ( left, right - 1, nums );
    //     }
    //     if ( mid >= 1 && nums[mid] < nums[left] ) {
    //         return nums[mid];
    //     }
    //     else if ( nums[mid] >= nums[left] && nums[mid] >= nums[right] ) {
    //         return binary_search ( mid + 1 , right, nums );
    //     }
    //     else {
    //         return binary_search ( left, mid - 1, nums );
    //     }
    if (num == null || num.length == 0) return 0;
        int l = 0;
        int r = num.length - 1;

        while (l <= r) {
           
            while (l <= r && num[l] == num[r]) l++;
            if (l > r){return num[r];}
        
            if (num[l] < num[r]) return num[l];
            
            int mid = l + (r - l) / 2;
            if (num[mid] >= num[l]) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}