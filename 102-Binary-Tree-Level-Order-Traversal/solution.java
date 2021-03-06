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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if ( root == null ) {return result;}
        helper( root, result, 0 );
        return result;
    }
    public void helper( TreeNode root, List<List<Integer>> result, int height ) {
        if ( root == null ) { return; }
        if ( height >= result.size() ) { result.add( new ArrayList<Integer>() ); }
        result.get(height).add(root.val);
        helper( root.left, result, height + 1);
        helper( root.right, result, height + 1);
    }
}