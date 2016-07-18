/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) { // 1.get length for a and b
        if ( headA == null || headB == null ) { return null; }            //2. move one to same level 3.check both's nodes
        int a_length = length(headA);
        int b_length = length(headB);
        
        while ( a_length > b_length ) {
            headA = headA.next;
            a_length --;
        }
        while ( a_length < b_length ) {
            headB = headB.next;
            b_length --;
        }
        
        while ( headA != null and headB != null ) {
            if ( headA.val == headB.val ) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
        
    }
    
    public int length ( ListNode a ) {
        int length = 0;
        while ( a != null ) {
            a = a.next;
            length ++;
        }
        return length;
    }
    
    
}