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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ( p == null && q == null ) {return true;}
        else if ( p == null || q == null ) { return false;}
        else {
            Stack<TreeNode> p_stack = new Stack<>();
            Stack<TreeNode> q_stack = new Stack<>();
            p_stack.push( p );
            q_stack.push( q );
            while ( p_stack != null && q_stack != null ) {
                TreeNode for_p = p_stack.pop();
                TreeNode for_q = q_stack.pop();
                if ( for_p.value != for_q.val ) { return false; }
                if ( p.left != null && q.left != null) {
                    p_stack.push(p.left);
                    q_stack.push(q.left);
                }
                if ( q.right != null && p.right != null ) {
                    p_stack.push(p.right);
                    q_stack.push(q.right);
                }
            }
            if ( p_stack != null || q_stack != null ) {return false;}
            return true;
        }
    }
}