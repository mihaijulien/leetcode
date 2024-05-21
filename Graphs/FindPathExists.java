class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination){
            return true;
        }
        
        //create graph from the array of edges
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        // initialize the adjacency list for each node
        for(int i=0; i<n; i++){
            graph.put(i, new ArrayList<>());
        }
        
        for(int[] edge : edges){
            // it's a bi-directional graph aka undirected graph
           graph.get(edge[0]).add(edge[1]);
           graph.get(edge[1]).add(edge[0]);
        }
        
        // initialize an array to keep track of visited nodes
        boolean[] visited = new boolean[n];
        // depth-first search on the graph
        dfs(graph, visited, source);
        
        // if the destination node was visited ? true : false
        return visited[destination];
    }
    
    
    private void dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int currentVertex){
        if(visited[currentVertex]){
            return;
        }
        
        // mark the current vertex as visited
        visited[currentVertex] = true;
        
        // visit the rest which are in the adjacency list
        for(int vertex : graph.get(currentVertex)){
            dfs(graph, visited, vertex);
        }
    }
}
