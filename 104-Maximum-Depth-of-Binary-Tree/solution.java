/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        int max = 0;
        int[] result = new int[1];
        result[0] = 0;
        max=max_helper(root, 0, 0);
        return max;
    }
    
    public int max_helper(TreeNode curr, int a, int max) {
        if (curr == null) return 0;
        int left = max_helper(curr.left, a, max);
        int right = max_helper(curr.right, a, max);
        return Math.max(left, right) + 1;
    }
}