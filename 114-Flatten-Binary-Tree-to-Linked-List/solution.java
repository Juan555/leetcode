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
    public void flatten(TreeNode root) {
        //Moris Traversal
        TreeNode now = root;
        while ( now.left != null ) {
            TreeNode curr = now.left;
            while ( curr.right != null ) {
                curr = curr.right;
            }
            curr.right = now.right;
            curr.right = curr.left;
            curr.left = null;
            now = now.right;
        }
    }
}