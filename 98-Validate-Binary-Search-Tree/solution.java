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
    public boolean isValidBST(TreeNode root) {
        if ( root.left == null || root.right == null ) {return true;}
        if ( root.left != null && root.left.val < root.val ) {
            return isValidBST ( root.left );
        }
        else if ( root.right != null && root.left.val > root.val ) {
            return isValidBST ( root.right );
        }
        else { return false; }
    }
}