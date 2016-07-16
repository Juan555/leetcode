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
    public int maxDepth(TreeNode root) {
        if ( root == null ) {
            return 0;
        }
        int max = 0;
        int a = 0;
        Vector<Integer> v = new Vector<Integer>(0);
        max_helper(root, a, v);
        return v.lastElement;
    }
    
    public void max_helper(TreeNode curr, int a, Vector v) {
        if ( curr == null ) {
            v.add(a + 1);
        }
        max_helper ( curr.left, a + 1, v );
        max_helper ( curr.right, a + 1, v );
    }
}