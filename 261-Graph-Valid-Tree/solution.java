public class Solution {
    public boolean validTree(int n, int[][] edges) {
        int[] visited = new int[n];
        List<List<Integer>> map = new ArrayList<List<Integer>>();
        for( int i = 0; i < n; ++i ) {
            map.add( new ArrayList<Integer>() );
        }
        for ( int i = 0; i < edges.length; ++i ) {
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }
        boolean result = helper(-1, 0, map, visited);
        if (result){//if loop exists
            return false;
        }
        for ( Integer hello: visited ){
            if (hello == 0) { return false; }//check disconnection
        }
        return true;
    }
    // public boolean helper(int prev, int curr, List<List<Integer>> map, int[] visited){
    //     for ( Integer hello: map.get(curr) ) {
    //         visited[curr] = 1;
    //         if ( curr != prev ) {
    //             if ( visited[hello] == 1) {return true;}
    //             if (helper( curr, hello, map, visited )){return true;}
    //         }
    //     }
    //     return false;
    // }
    private boolean helper(int pred, int vertex, List<List<Integer>> adjList, int[] visited) {
        visited[vertex] = 1;  // current vertex is being visited
        for (Integer succ: adjList.get(vertex)) {  // successors of current vertex
            if (succ != pred) {  // exclude current vertex's predecessor
                if (visited[succ] == 1) { return true; }  // back edge/loop detected!
                else if (visited[succ] == 0) {
                    if (helper(vertex, succ, adjList, visited)) { return true; }
                }
            }
        }

        return false;
    }
}