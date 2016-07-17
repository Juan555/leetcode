import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    ListNode dummy_head = new ListNode();
    ListNode tail = dummy_head;
    Map<Integer, ListNode> map = new HashMap<>();
    int capa;
    
    static class ListNode{ //how to create a ListNode, why static though??????

        ListNode next;
        ListNode prev;
        int val;
        int node_key;
        ListNode( int a, int b ) {
            node_key = a;
            val = b;
        }
        ListNode(){} //ListNode constructor, has bug missing{}
        
    }
    
    public LRUCache(int capacity) {
        capa = capacity;
    }
    
    public void move_to_end( ListNode curr ) {
        if ( curr == tail ) { return; }
        //unlink this node with other nodes
        curr.prev.next = curr.next;
        if ( curr.next != null ) {
            curr.next.prev = curr.prev;
        }
        add_to_end( curr );
    }
    
    public void add_to_end( ListNode curr ) {
        //link to tail
        curr.prev = tail;
        tail.next = curr;
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
        
        return result;
    }
    
    public void set(int key, int value) {
        if ( map.containsKey(key) ) {
            ListNode curr_node = map.get(key);
            curr_node.val = value;
            move_to_end(curr_node);
        }
        
        else {
            
            ListNode new_tail = new ListNode(key, value);
            add_to_end(new_tail);
            map.put(key, new_tail);
            //add to map; add to tail in ListNode
            if ( map.size()  > capa) { //big bug here, remove after adding cuz u might remove null pointer
              ListNode temp = dummy_head.next;

               
              if ( dummy_head.next != null ) {
                  dummy_head.next = temp.next;
                  map.remove(temp.node_key);
                  dummy_head.next.prev = dummy_head;
              }
            }
        }
    }
}