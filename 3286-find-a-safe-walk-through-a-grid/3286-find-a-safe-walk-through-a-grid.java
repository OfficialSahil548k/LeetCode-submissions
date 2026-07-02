class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int n = grid.size();
        int m = grid.get(0).size();

        int[][] dist = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        Deque<int[]> dq = new ArrayDeque<>();

        // Starting cost
        dist[0][0] = grid.get(0).get(0);
        dq.offerFirst(new int[]{0, 0});

        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        while (!dq.isEmpty()) {
            int[] curr = dq.pollFirst();
            int r = curr[0];
            int c = curr[1];

            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
                    continue;
                }

                int cost = grid.get(nr).get(nc);
                int newCost = dist[r][c] + cost;

                if (newCost < dist[nr][nc]) {
                    dist[nr][nc] = newCost;

                    if (cost == 0) {
                        dq.offerFirst(new int[]{nr, nc});
                    } else {
                        dq.offerLast(new int[]{nr, nc});
                    }
                }
            }
        }

        return dist[n - 1][m - 1] < health;
    }
}