class Solution {
    private int amount(int[] house, int n, int i, int free, int[][] dp) {
        if (i == n)
            return 0;
        if (dp[i][free] != -1)
            return dp[i][free];

        if (free == 0) {
            return dp[i][free] = amount(house, n, i + 1, 1, dp);
        }

        int c1 = house[i] + amount(house, n, i + 1, 0, dp);
        int c2 = amount(house, n, i + 1, 1, dp);

        return dp[i][free] = Math.max(c1, c2);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] t = new int[2];
            Arrays.fill(t, -1);
            dp[i] = t;
        }
        return amount(nums, n, 0, 1, dp);
    }
}