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
        //recursive one
    //     if ( head == null ) {return head;}
    //     return reverse_helper(head);
    // }
    // public ListNode reverse_helper( ListNode curr ){
    //     if ( curr.next == null ){
    //         return curr;
    //     }
    //     ListNode head = reverse_helper( curr.next );
    //     curr.next.next = curr;
    //     curr.next = null;
    //     return head;
    
    //iterative one
    ListNode prev = null;
    ListNode temp = null;
    ListNode curr = head;
    while (curr != null) {
        temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
    }
    return prev;
    }
}