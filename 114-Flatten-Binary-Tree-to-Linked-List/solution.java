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
        while ( now != null ) {
            if ( now.left != null ) {
                TreeNode curr = now.left;
                while ( curr.right != null ) {
                curr = curr.right;
                }
                curr.right = now.right;
                now.right = now.left;
                now.left = null;
                now = now.right;
            }
            
        }
    }
}