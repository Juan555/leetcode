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
        max_helper(root, 0, result);
        return max;
    }
    
    public void max_helper(TreeNode curr, int a, int max) {
        if ( curr == null ) {
            if ( a > max ) {
                max = a;
            }
        }
        max_helper ( curr->left, a + 1, max );
        max_helper ( curr->right, a + 1, max );
    }
}