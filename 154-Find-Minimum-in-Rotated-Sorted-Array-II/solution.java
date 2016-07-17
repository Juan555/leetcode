public class Solution {
    public int findMin(int[] num) {
        if (num == null || num.length == 0) return 0;
        int l = 0;
        int r = num.length - 1;
        while (l <= r) {
            int k = l;
            while (k <= r && num[k] == num[r]) k++;
            if (k > r) return num[l];
            l = k;
            if (num[l] < num[r]) return num[l];
            int mid = l + (r - l) / 2;
            if (num[mid] >= num[l]) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}