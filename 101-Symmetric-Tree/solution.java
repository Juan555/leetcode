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
        if ( root == null ) { return true; }
        return helper ( root.left, root.right );}
    public boolean helper ( TreeNode left, TreeNode right ) {
        if ( left == null && right == null ) {return true;}
        if ( left == null || right == null ) { return false;}
        if ( left.val == right.val ) {
            return helper ( left.left, right.right ) && helper ( left.right, right.left );
        }
        else { return false; }
    }
        
        //我知道这个方法很烂。。。但是反正过了哈哈哈
    //     List<List<Integer>> result = new ArrayList<List<Integer>>();
    //     if ( root == null ) { return true; }
    //     helper( root, result, 0 );
    //     for ( int i = 0; i < result.size(); ++i ) {
    //         int length = result.get(i).size();
    //         for ( int j = 0; j < length/2; ++j ) {
    //             if ( result.get(i).get(j) != result.get(i).get(length - j -1) ){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }
    // public void helper( TreeNode root, List<List<Integer>> result, int height ) {
    //     if ( root == null ) { 
    //         if ( height >= result.size() ) {
    //             result.add( new ArrayList<Integer>() );
    //         }
    //         result.get(height).add(0); 
    //         return;
    //     }
    //     if ( height >= result.size() ) {
    //         result.add( new ArrayList<Integer>() );
    //     }
    //     result.get(height).add(root.val);
    //     helper( root.left, result, height + 1);
    //     helper( root.right,result, height + 1);
    
}