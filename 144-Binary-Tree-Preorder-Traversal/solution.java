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
        if ( root == null ) return 0;
        else {
            result.add(root.val);
            int left = helper( root.left, result );
            int right = helper( root.right, result );
            return result;
        }
    }
}