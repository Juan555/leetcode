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
    
    public void max_helper(TreeNode curr, int a, int[]result) {
        if ( curr == null ) {
            if ( a > result[0]){
                result[0] = a;
            }
            return;
        }
        max_helper ( curr->left, a + 1, result );
        max_helper ( curr->right, a + 1, result );
    }
}