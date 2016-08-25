/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        HashMap<Integer, List<UndirectedGraphNode>> map = new HashMap<Integer, List<UndirectedGraphNode>>();
        if ( node == null ) { return null;}
        UndirectedGraphNode result = new UndirectedGraphNode(node.label);
        map.put(node.label, result.neighbors);
        helper( node, result, map );
        return result;
    }
    public void helper(UndirectedGraphNode node,UndirectedGraphNode last, HashMap<Integer, List<UndirectedGraphNode>> map){
        if ( node == null ) {return;}
        if ( map.containsKey(node.label) ){
            map.get(node.label).insert(last);
            node = node.next;}
        else { 
            UndirectedGraphNode new_one = new UndirectedGraphNode(node.label);
            new_one.neighbors.insert(last);
            last.neighbors.insert(new_one);
            map.put(node.label, new_one.neighbors);
            helper( node.next, new_one, map);
        }
    }
}