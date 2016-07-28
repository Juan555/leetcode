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
        // 1st solution
    //     List<Integer> result = new ArrayList<Integer>();
    //     if ( root == null ) {return result;}
    //     helper( root, result );
    //     return result;
    // }
    // public void helper( TreeNode root, List<Integer> result ){
    //     if ( root == null ) return;
    //     else {
    //         result.add(root.val);
    //         helper( root.left, result );
    //         helper( root.right, result );
    //     }
    
    Stack<TreeNode> stack = new Stack<>();
    List<Integer> result = new ArrayList<>();
    if ( root != null ) { 
    stack.push ( root );
    while ( !stack.isEmpty() ) {
        TreeNode curr = stack.pop();
        result.add ( curr.val );
        if ( root.right != null ) { stack.push ( curr.right ); }
        if ( root.left != null ) { stack.push ( curr.left );}
        
    }
    }
    return result;
    }
    // Stack<TreeNode> stack = new Stack<>();
    //     List<Integer> traversal = new ArrayList<>();
    //     if(root!=null){
    //         stack.push(root);
    //         while(!stack.isEmpty()){
    //             TreeNode curr = stack.pop();
    //             traversal.add(curr.val);
    //             if(curr.right!=null){ stack.push(curr.right); }
    //             if(curr.left!=null){ stack.push(curr.left);  }
    //         }
    //     }
    //     return traversal;
}