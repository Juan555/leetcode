public class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = num.length - 1;
        while (l <= r) {    int k = l;}
        while (k <= r && num[k] == num[r]) {k++;}
        
        if (k > r) {return num[l];   }    
        l = k;        
        if (num[l] < num[r]) {return num[l];}
        int mid = l + (r - l) / 2;
        if (num[mid] >= num[l]) {l = mid + 1; }// min in right half
        else {r = mid;} 
         return num[l];
    }
}