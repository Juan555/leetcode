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
    public boolean isSymmetric(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if ( root == null ) { return true; }
        helper( root, result, 0 );
        for ( int i = 0; i < result.size(); ++i ) {
            int length = result.get(i).size();
            for ( int j = 0; j < length/2; ++j ) {
                if ( result.get(i).get(j) != result.get(i).get(length - j) ){
                    return false;
                }
            }
        }
        return true;
    }
    public void helper( TreeNode root, List<List<Integer>> result, int height ) {
        if ( root == null ) { return; }
        if ( height >= result.size() ) {
            result.add( new List<Integer>() );
        }
        result.get(height).add(root.val);
        helper( root.left, result, height + 1);
        helper( root.right,result, height + 1);
    }
}