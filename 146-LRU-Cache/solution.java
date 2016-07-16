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
    
    public void move_to_end( ListNode curr ) {
        curr.prev = tail.next;
        tail.next = curr.prev;
        curr.next = null;
        tail = curr;
    }
    
    public int get(int key) {
        int result = -1;
        if ( map.containsKey(key) ) {
            ListNode curr_node = map.get(key);
            result = curr_node.val;
            move_to_end(curr_node);
            }
        }
        return result;
    }
    
    public void set(int key, int value) {
        if ( map.containsKey(key) ) {
            ListNode curr_node = map.get(key);
            move_to_end(curr_node);
        }
        
        else {
            if ( map.size() + 1 >= capa) { //find head, remove head and add to tail; find head in map, replace head
                int temp_head = head.node_key;
                head = head.next;//in ListNode
                map.remove(temp_head);
            }
            ListNode new_tail = new ListNode(key, value);
            move_to_end(new_tail);
            map.put(key, new_tail);
            //add to map; add to tail in ListNode
        }
    }
}