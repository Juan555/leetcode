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
        if ( root == null ) {return null;}
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        boolean judge = false;
        while (q.size() >= 1 ) {
            List<Integer> comp = new ArrayList<Integer>();
            for ( int i = 0; i < q.size(); ++i ) {
                TreeNode n = q.poll();
                if ( !judge ) {comp.add(n.val);}
                else {comp.add(0, n.val);}
                if ( n.left != null ) {comp.add(n.left);}
                if ( n.right != null ) { comp.add(n.right); }
            }
            judge = !judge;
            result.add(comp);
        }
        return result;
    }
}