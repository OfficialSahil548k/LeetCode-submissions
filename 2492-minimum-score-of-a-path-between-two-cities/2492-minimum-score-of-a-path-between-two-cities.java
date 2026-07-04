class Solution {
    List<int[]>[] graph;
    boolean[] visited;
    int ans = Integer.MAX_VALUE;

    public int minScore(int n, int[][] roads) {

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int dist = road[2];

            graph[u].add(new int[] { v, dist });
            graph[v].add(new int[] { u, dist });
        }

        dfs(1);
        return ans;
    }

    private void dfs(int node) {
        visited[node] = true;

        for (int[] edge : graph[node]) {
            int neighbour = edge[0];
            int dist = edge[1];

            ans = Math.min(ans, dist);

            if (!visited[neighbour]) {
                dfs(neighbour);
            }
        }
    }
}