class Solution {

    List<Integer>[] graph;
    boolean[] vis;
    int vertices;
    int edges;

    void dfs(int node) {

        vis[node] = true;
        vertices++;
        edges += graph[node].size();

        for (int next : graph[node]) {
            if (!vis[next]) {
                dfs(next);
            }
        }
    }

    public int countCompleteComponents(int n, int[][] edgesArr) {

        graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edgesArr) {
            int u = edge[0];
            int v = edge[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        vis = new boolean[n];

        int answer = 0;

        for (int i = 0; i < n; i++) {

            if (!vis[i]) {

                vertices = 0;
                edges = 0;

                dfs(i);

                edges /= 2;

                if (edges == vertices * (vertices - 1) / 2) {
                    answer++;
                }
            }
        }

        return answer;
    }
}