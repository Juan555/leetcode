/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {//pay attention to the type(list instead of set)
        if ( l1 == null ) { return l2; }
        if ( l2 == null ) { return l1; }
        ListNode dummy_result = new ListNode(-1);
        ListNode traverse = dummy_result;
        int update = 0;
        int sum = 0;
        while ( l1 != null || l2 != null ) {
            sum = l1.val + l2.val + update;
            update = sum%10;
        }
        if ( update == 1 ) {
            
        }
        return dummy_result.next;
        // int update = 0;
        // if ( l1.val + l2.val > 9 ) {
        //     ListNode result = new ListNode( (l1.val+l2.val)%10 );
        //     update = 1;
        // }
        // else { ListNode result = new ListNode(l1.val + l2.val);}
        // ListNode head = result;
        
        // while ( l1 != null || l2 != null ) {
        //     if ( l1 == null ) {
        //         if ( l2.val + update > 9 ) {
        //             result.next = new ListNode(0);
        //         }
        //         else { 
        //             result.next = new ListNode(l2.val+update);
        //             update = 0;
        //         }
        //         l2 = l2.next;
        //     }
        //     else if ( l2 == null ){
        //         if ( l1.val + update > 9 ) {
        //             result.next = new ListNode(0);
        //         }
        //         else { 
        //             result.next = new ListNode( l1.val+update );
        //             update = 0;
        //         }
        //         l1 = l1.next;
        //     }
        //     else{
        //         int sum = l1.val + l2.val + update;
        //         if ( sum > 9 ) {
        //             result.next = new ListNode(sum%10);
        //             update = 1;
        //         }
        //         else {
        //             result.next = new ListNode(sum);
        //             update = 0;
        //         }
        //         l1 = l1.next;
        //         l2 = l2.next;
        //         result = result.next;
        //     }
        // }
        // if ( update == 1 ) { result.next = new ListNode(1); }
        // return head;
    }
}