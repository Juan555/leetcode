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
        return clone( node );
    }
    public UndirectedGraphNode clone( UndirectedGraphNode node ){
        if ( node == null ) {return null;}
        if ( map.containsKey(node.label) ){
            return map.get(node.label);
        }
        UndirectedGraphNode curr = new UndirectedGraphNode(node.label);
        map.put(node.label, curr);
        for ( UndirectedGraphNode orig: node.neighbors ) {
            curr.neighbors.add(clone(orig) );
        }
        return curr;
    }
}