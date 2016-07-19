/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        //check null
        if ( lists.length < 1 || lists == null ) {return null; }
        //build  PriorityQueue
        PriorityQueue<ListNode> queue = new PriorityQueue( lists.length, new Comparator<ListNode>(){

            public int compare( ListNode a, ListNode b ) {
                return a.val - b.val;
            }
        });
        //put first ListNode in priorityQueue
        for ( ListNode a: lists ){ // bug here:[[]]
            if (a != null ){
            queue.offer(a);}
        }
        //start the list and constantly add listNode into the queue
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while ( !queue.isEmpty() ) {
            ListNode h = queue.poll();
            curr.next = h;
            curr = curr.next;
            if ( h.next != null ){
                queue.offer(h.next);
            }
        }
        return dummy.next;//how to make sure the head is there
        

    }
}