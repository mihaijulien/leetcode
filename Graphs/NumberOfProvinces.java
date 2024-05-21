class Solution {
    public int findCircleNum(int[][] isConnected) {
        if(isConnected.length == 0){
            return 0;
        }
        
        int provinces = 0;
        boolean[] visited = new boolean[isConnected.length];
        
        for(int i=0; i<isConnected.length; i++){
            if(!visited[i]) {
                provinces++;
                dfs(isConnected, visited, i);
            }
        }
        return provinces;
    }
    
    private void dfs(int[][] isConnected, boolean[] visited, int i){
        if(visited[i]) {
            return;
        }
        
        visited[i] = true; // mark the current node as visited
        for(int j=0; j<isConnected[0].length; j++){
            if(isConnected[i][j] == 1) {
                dfs(isConnected, visited, j);
            }
        }
    }
}
