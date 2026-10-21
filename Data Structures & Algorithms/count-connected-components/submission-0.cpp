class Solution {
public:
void dfs(int vertex, vector<vector<int>>& adj, vector<bool>& visited){
    visited[vertex] = true;
    for(int it : adj[vertex]){
        if(visited[it])continue;
        dfs(it, adj, visited);
    }
}
    int countComponents(int n, vector<vector<int>>& edges) {
        vector<vector<int>> adj(n);

        for(auto& edge : edges){
            int u = edge[0];
            int v = edge[1];

            adj[u].push_back(v);
            adj[v].push_back(u);
        }
        vector<bool>visited(n, false);
        int count = 0;
        for(int i=0; i<n; i++){
            if(visited[i]) continue;
            dfs(i, adj, visited);
            count++;
        }
        return count;
    }
};
