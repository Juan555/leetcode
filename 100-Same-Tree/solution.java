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
            while ( !p_stack.isEmpty() && !q_stack.isEmpty() ) {
                TreeNode for_p = p_stack.pop();
                TreeNode for_q = q_stack.pop();
                if ( for_p.val != for_q.val ) { return false; }
                if ( for_p.left != null){p_stack.push(for_p.left);}
                if (for_q.left != null) {q_stack.push(for_q.left);}
                if ( q_stack.size() != p_stack.size() ) {return false;}
                if ( for_q.right != null) {q_stack.push(for_q.right);}
                if (for_p.right != null ) {p_stack.push(for_p.right);}
                if ( q_stack.size() != p_stack.size() ) {return false;}
            }
            if ( !p_stack.isEmpty() || !q_stack.isEmpty() ) {return false;}
            return true;
        }
    }
}