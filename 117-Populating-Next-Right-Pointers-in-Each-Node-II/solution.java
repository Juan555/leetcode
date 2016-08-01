/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeNode curr = root;
        TreeNode prev = null;
        TreeNode head = null;
        while ( curr != null ) { // check the end of level
            while ( curr != null ) {//check if it's end of each level
             if ( curr.left != null ) {
                 if ( prev != null ) {
                     prev.next = curr.left;
                 }
                 else { head = curr.left; }
                 prev = curr.left;
             }
             if ( curr.right != null ) {
                 if ( prev != null ) {
                     prev.next = curr.right;
                 }
                 else { head = curr.right; }
                 prev = curr.right;
             }
             curr = curr.next;   
            }
            curr = head;
            head = null;
            prev = null;
        }
    }
}