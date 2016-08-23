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
        if ( curr.next == null ){
            return curr;
        }
        ListNode head = reverse_helper( new_head, curr.next );
        curr.next.next == curr;
        return head;
    }
}