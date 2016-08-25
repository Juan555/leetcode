/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    HashMap<Integer, UndirectedGraphNode> map = new HashMap<Integer, UndirectedGraphNode>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if ( node == null ) { return null; }
        UndirectedGraphNode result = new UndirectedGraphNode(node.label);
        helper( node);
        return map.get(node.label);
        }
    public void helper(UndirectedGraphNode node, UndirectedGraphNode result ) {
        if ( node == null ) {return;}
        if ( map.containsKey(node.label) ) {
            map.get(node.label).add(map.get(node.label));
        }
        else{UndirectedGraphNode new_one = new UndirectedGraphNode(node.label);
        map.put( node.label, new_one );}
        for (UndirectedGraphNode curr: node.neighbors) {
            helper(curr);
        }
    }
}