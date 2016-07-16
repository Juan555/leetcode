public class LRUCache {
    ListNode head = new ListNode();
    ListNode tail = head;
    Map<Integer, ListNode> map = new Hashmap<>();
    int capa;
    
    public class ListNode{ //how to create a ListNode

        ListNode next;
        ListNode prev;
        int val;
        int node_key;
        ListNode( int a, int b ) {
            node_key = a;
            val = b;
        }
        ListNode(); //ListNode constructor
    }
    
    public LRUCache(int capacity) {
        capa = capacity;
    }
    
    public int get(int key) {
        int result = -1;
        if ( map.containsKey(key) ) {
            result = map.get(key);
            findKeyInListNode: if (found) {//Move to tail
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                curr.prev = tail.next;
                tail.next = curr.prev;
            }
            if (!found ) {
                ListNode curr = new ListNode;
                curr.val = key;
                tail.next = curr;
                curr.prev = tail;
                tail = curr;
            }
        }
        return result;
    }
    
    public void set(int key, int value) {
        if ( map.containsKey(key) ) {
            map.get(key) = value;
            findKeyInListNode: if (found) {//move to tail
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                curr.prev = tail.next;
                tail.next = curr.prev;
            }
        }
        
        else {
            if (length + 1 >= capacity) { //find head, remove head and add to tail; find head in map, replace head
                int temp_head = head.val;
                head = head.next;//in ListNode
                map.remove(temp_head);
            }
            ListNode new_tail = new ListNode();
            new_tail.val = key;
            tail.next = new_tail;
            new_tail.prev = tail;
            tail = new_tail;
            map.put ( key, value );//add to map; add to tail in ListNode
        }
    }
}