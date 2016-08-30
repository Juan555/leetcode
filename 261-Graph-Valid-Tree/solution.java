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
    public boolean helper(int prev, int curr, List<List<Integer>> map, int[] visited){
        for ( Integer hello: map.get(curr) ) {
            visited[i] = 1;
            if ( curr != prev ) {
                if ( visited[hello] == 1) {return true;}
                helper( curr, hello, map, visited );
            }
        }
        return false;
    }
}