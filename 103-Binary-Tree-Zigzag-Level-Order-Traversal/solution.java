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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        // List<List<Integer>> result = new ArrayList<List<Integer>>();
        // if ( root == null ) {return result;}
        // Queue<TreeNode> q = new LinkedList<TreeNode>();
        // q.add(root);
        // boolean judge = false;
        // while (q.size() >= 1 ) {
        //     List<Integer> comp = new ArrayList<Integer>();
        //     int size = q.size();//there is a huge bug here!!!!! remember to have fixed size
        //     for ( int i = 0; i < size; ++i ) {
        //         TreeNode n = q.poll();
        //         if ( !judge ) {comp.add(n.val);}
        //         else {comp.add(0, n.val);}
        //         if ( n.left != null ) {q.add(n.left);}
        //         if ( n.right != null ) { q.add(n.right); }
        //     }
        //     judge = !judge;
        //     result.add(comp);
        // }
        // return result;
        List<List<Integer>> result = new ArrayList<List<Integer>>();//居然就这样过了，而去是一遍头，我也是跪了。。。
        if ( root == null ) {return result;}
        helper ( root, result, 0, true );
        return result;
    }
    public void helper ( TreeNode root, List<List<Integer>> result, int height, boolean level ) {
        if ( root == null ) { return; }
        if ( height >= result.size() ) {
            result.add( new ArrayList<Integer>() );
        }
        if ( level ) {result.get(height).add(root.val); }
        else { result.get(height).add(0, root.val);}
        helper( root.left, result, height + 1, !level);
        helper( root.right, result, height + 1, !level);
    }
}