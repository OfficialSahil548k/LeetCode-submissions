class Solution {
    int MOD = 1000000007;

    public int[] pathsWithMaxScore(List<String> board) {
        int n = board.size();

        int[][] score = new int[n][n];
        int[][] ways = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(score[i], -1);
        }

        score[n - 1][n - 1] = 0;
        ways[n - 1][n - 1] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                char cell = board.get(i).charAt(j);

                if (cell == 'X' || (i == n - 1 && j == n - 1))
                    continue;

                int best = -1;

                if (i + 1 < n) best = Math.max(best, score[i + 1][j]);
                if (j + 1 < n) best = Math.max(best, score[i][j + 1]);
                if (i + 1 < n && j + 1 < n)
                    best = Math.max(best, score[i + 1][j + 1]);

                if (best == -1) continue;

                long count = 0;

                if (i + 1 < n && score[i + 1][j] == best)
                    count += ways[i + 1][j];

                if (j + 1 < n && score[i][j + 1] == best)
                    count += ways[i][j + 1];

                if (i + 1 < n && j + 1 < n &&
                    score[i + 1][j + 1] == best)
                    count += ways[i + 1][j + 1];

                ways[i][j] = (int)(count % MOD);

                int val = 0;
                if (cell != 'E') {
                    val = cell - '0';
                }

                score[i][j] = best + val;
            }
        }

        if (ways[0][0] == 0)
            return new int[]{0, 0};

        return new int[]{score[0][0], ways[0][0]};
    }
}