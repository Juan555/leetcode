public class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = num.length - 1;
        if (num.length == 1 || num[l] < num[r]) return num[0];
        
        int mid = 0;
        while (l < r) {
            mid = l + (r - l) / 2;
            System.out.println(mid);
            if (num[l] < num[mid]) l = mid;
            else r = mid;
        }
        return num[l + 1];
    }
}