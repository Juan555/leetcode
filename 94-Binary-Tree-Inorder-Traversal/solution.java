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
    public List<Integer> inorderTraversal(TreeNode root) {
        //1st solution
    //     List<Integer> result = new ArrayList<>();
    //     if ( root == null ) { return result; }
    //     helper ( root, result );
    //     return result;
    // }
    // public void helper ( TreeNode root, List<Integer> result ) {
    //     if ( root == null ) {return;}
    //     helper( root.left, result );
    //     result.add( root.val );
    //     helper( root.right, result );
    List<Integer> result = new ArrayList<>();
    if ( root == null ) { return result; }
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = root;
    while ( curr != null || !stack.isEmpty() ) {
        while ( curr != null ) {
            stack.push ( curr );
            curr = curr.left;
        }
        curr = stack.pop();
        result.add ( curr.val );
        curr = curr.right;
    }
    return result;
    }
}