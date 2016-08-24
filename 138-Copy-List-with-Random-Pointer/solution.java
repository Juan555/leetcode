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
        RandomListNode curr = copy_head.next;
        while( curr.next != null ){
            orig_curr.next = curr.next;
            curr.next = orig_curr.next.next;
            
            orig_curr = orig_curr.next;
            curr = curr.next;
        }
        orig_curr.next = null;
        return copy_head.next;
//         public RandomListNode copyRandomList(RandomListNode head) {
// 	//<original, clone>
//     HashMap<RandomListNode, RandomListNode> maps = new HashMap<RandomListNode, RandomListNode>();
//     RandomListNode cursor = head;
//     while(null != cursor){
//         maps.put(cursor, new RandomListNode(cursor.label));
//         cursor = cursor.next; 
//     }
//     cursor = head;
//     while(null != cursor){
//     	maps.get(cursor).random = maps.get(cursor.random);
//     	cursor = cursor.next;
//     }
//     cursor = head;
//     while(null != cursor){
//     	maps.get(cursor).next = maps.get(cursor.next);
//         cursor = cursor.next;
//     }
//     return maps.get(head);
// }
    }
}