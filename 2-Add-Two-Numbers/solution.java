/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int update = 0;
        ListNode result = new ListNode();
        while ( l1.val != null || l2.val != null ) {
            if ( l1 == null ) {
                if ( l2.val + update > 9 ) {
                    result.insert(0);
                }
                else { 
                    result.insert(new ListNode(l2.val+update));
                    update = 0;
                }
            }
            else if ( l2 == null ){
                if ( l1.val + update > 9 ) {
                    result.insert(0);
                }
                else { 
                    result.insert(new ListNode( l1.val+update ));
                    update = 0;
                }
            }
            else{
                int sum = l1.val + l2.val + update;
                if ( sum > 9 ) {
                    result.insert(new ListNode(sum%10));
                    update = 1;
                }
                else {
                    result.insert(new ListNode(sum));
                    update = 0;
                }
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if ( update == 1 ) { result.insert(new ListNode(1)); }
        return result;
    }
}