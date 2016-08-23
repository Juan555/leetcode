/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse_helper(head);
    }
    public ListNode reverse_helper( ListNode curr ){
        if ( curr == null || curr.next == null ){
            ListNode head = curr;
            return curr;
        }
        reverse_helper( curr.next );
        curr.next = curr;
        return head;
    }
}