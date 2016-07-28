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
        return result;
    }
    public void helper( TreeNode root, List<Integer> result ){
        if ( root == null ) return 0;
        else {
            result.add(root.val);
            helper( root.left, result );
            helper( root.right, result );
        }
    }
}