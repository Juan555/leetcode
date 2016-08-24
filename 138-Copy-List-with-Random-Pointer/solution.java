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
        RandomListNode iter = head;
        RandomListNode next_node = head;
        //copy each node side by side to form a single linked list
        while ( iter != null ) {
            next_node = iter.next;
            RandomListNode copy = new RandomListNode( iter.label );
            iter.next = copy;
            copy.next = next_node;
            iter = next_node;
        }
        //assign random values
        iter = head;
        while ( iter != null ) {
            if ( iter.random != null ) {
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }
        RandomListNode copy_head = new RandomListNode(-1);
        copy_head.next = head.next;
        RandomListNode orig_curr = head;
        RandomListNode curr = copy_head;
        while( curr.next != null ){
            orig_curr.next = curr.next;
            curr.next = orig_curr.next.next;
            
            orig_curr = orig_curr.next;
            curr = curr.next;
        }
        return copy_head.next;
        // if ( head == null ) {
        //     RandomListNode null_copy = null;
        //     return null_copy;
        // }
        // RandomListNode curr = new RandomListNode(head.label);
        // RandomListNode new_head = curr;
        // RandomListNode orig_curr = head;
        // while ( orig_curr.next != null ) {
        //     curr.next = new RandomListNode(orig_curr.next.label);
        //     orig_curr = orig_curr.next;
        //     curr = curr.next;
        // }
        // curr.next = null;
        // orig_curr = head;
        // curr = new_head;
        // if ( head.random == head ) {
        //     new_head.random = new_head;
        // }
        // while( orig_curr != null ){
        //     if ( orig_curr.random == null ) {
        //         curr.random = null;
        //     }
        //     else{
        //     RandomListNode old_temp = head;
        //     RandomListNode new_temp = new_head;
        //     while ( old_temp.next != null ) {
        //         if ( orig_curr.random == old_temp ){
        //             curr.random = new_temp;
        //             break;
        //         }
        //         else{
        //             old_temp = old_temp.next;
        //             new_temp = new_temp.next;
        //         }
                
        //     }
        //     }
        //     orig_curr = orig_curr.next;
        //     curr = curr.next;
        // }
        // return new_head;
    }
}