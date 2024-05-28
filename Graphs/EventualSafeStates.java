/*
graph = [[1,2],[2,3],[5],[0],[5],[],[]]

0 -> [1,2]
1 -> [2,3]
2 -> [5] OK
3 -> 0 
4 -> [5] OK
5 -> [] 
6 -> [] OK

*/

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] visit = new boolean[n];
        boolean[] inStack = new boolean[n];

        for (int i = 0; i < n; i++) {
            dfs(i, graph, visit, inStack);
        }

        List<Integer> safeNodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!inStack[i]) {
                safeNodes.add(i);
            }
        }

        return safeNodes;
    }
    
    public boolean dfs(int node, int[][] adj, boolean[] visit, boolean[] inStack) {
        // If the node is already in the stack, we have a cycle.
        if (inStack[node]) {
            return true; // return true as the node is unsafe
        }
        if (visit[node]) {
            return false;  // if already visited but not in stack, return false aka safe
        }
        // Mark the current node as visited and part of current recursion stack.
        visit[node] = true;
        inStack[node] = true;
        for (int neighbor : adj[node]) {
            if (dfs(neighbor, adj, visit, inStack)) {
                return true;
            }
        }
        // Remove the node from the stack.
        inStack[node] = false;
        return false;
    }
}
