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
        ListNode tail = reverse_helper(ListNode head);
        return head;
    }
    public ListNode reverse_helper( ListNode curr ){
        if ( curr == null || curr.next == null ){
            head = curr;
            return curr;
        }
        ListNode after = reverse_helper( curr.next );
        after.next = curr;
        return curr;
    }
}