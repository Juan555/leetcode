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
    public boolean isBalanced(TreeNode root) {
        if ( root == null ) {return true;}
        int left = depth( root.left );
        int right = depth ( root.right );
        return ( Math.abs(left - right) <= 1 && isBalanced( root.left ) && isBalanced( root.right );
    }
    public int depth( TreeNode root ) {
        if ( root == null ) {return 0;}
        int left = depth( root.left );
        int right = depth ( root.right );
        return Math.max( left, right ) + 1;
    }
}