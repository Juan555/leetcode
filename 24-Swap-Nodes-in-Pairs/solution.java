/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy_head = new ListNode(-1);
        ListNode prev = dummy_head;
        ListNode curr = head;
        if ( head == null || head.next == null ) {return head;}
        else{
            ListNode after = head.next;
        while ( curr != null && curr.next != null ) {
            prev.next = after;
            curr.next = after.next;
            after.next = curr;
            prev = curr;
            curr = curr.next;
            if ( curr != null ) { after = curr.next;}
        }
        }
        return dummy_head.next;
    }
}