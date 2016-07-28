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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if ( root == null ) {return result;}
        return helper( root, result );
    }
    public List<Integer> helper( TreeNode root, List<Integer> result ){
        if ( root == null ) return;
        else {
            result.add(root.val);
            helper( root.left.val );
            helper( root.right.val );
        }
    }
}