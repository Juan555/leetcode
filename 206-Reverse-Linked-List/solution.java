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
        ListNode new_head = new ListNode(-1);
        return reverse_helper(new_head, head).next;
    }
    public ListNode reverse_helper( ListNode new_head, ListNode curr ){
        if ( curr == null || curr.next == null ){
            new_head.next = curr;
            return curr;
        }
        reverse_helper( new_head, curr.next );
        curr.next = curr;
        return new_head;
    }
}