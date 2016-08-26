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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        return helper( root, result, "");
    }
    public List<String> helper(TreeNode curr, List<String> result, String element){
        if ( curr.left == null && curr.right == null ) {
            result.add( element + "->" + curr.val + "");
        }
        if ( curr.left != null ) {
            helper(curr.left, result, element + "->" + curr.val + "");
        }
        if ( curr.right != null ) {
            helper( curr.right, result, element + "->" + curr.val + "");
        }
        return result;
    }
}