public class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {    int k = l;}
        while (k <= r && nums[k] == nums[r]) {k++;}
        
        if (k > r) {return nums[l];   }    
        l = k;        
        if (nums[l] < nums[r]) {return nums[l];}
        int mid = l + (r - l) / 2;
        if (nums[mid] >= nums[l]) {l = mid + 1; }// min in right half
        else {r = mid;} 
         return nums[l];
    }
}