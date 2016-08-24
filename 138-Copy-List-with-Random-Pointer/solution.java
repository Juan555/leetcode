/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if ( head == null ) {
            RandomListNode null_copy = null;
            return null_copy;
        }
        RandomListNode curr = new RandomListNode(head.label);
        RandomListNode new_head = curr;
        RandomListNode orig_curr = head;
        while ( orig_curr != null ) {
            curr.next = new RandomListNode(orig_curr.next.label);
            orig_curr = orig_curr.next;
            curr = curr.next;
        }
        curr.next = null;
        orig_curr = head;
        curr = new_head;
        if ( head.random == head ) {
            new_head.random = new_head;
        }
        while( orig_curr != null ){
            if ( orig_curr.random == null ) {
                curr.random = null;
            }
            else{
            RandomListNode old_temp = head;
            RandomListNode new_temp = new_head;
            while ( old_temp.next != null ) {
                if ( orig_curr.random == old_temp ){
                    curr.random = new_temp;
                    break;
                }
                else{
                    old_temp = old_temp.next;
                    new_temp = new_temp.next;
                }
                
            }
            }
            orig_curr = orig_curr.next;
            curr = curr.next;
        }
        return new_head;
    }
}