class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {

        int[][] arr = new int[n][2];

        // Store (value, original index)
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Sort by value
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int[] component = new int[n];
        int comp = 0;

        // Assign component ids
        component[arr[0][1]] = comp;

        for (int i = 1; i < n; i++) {
            if (arr[i][0] - arr[i - 1][0] > maxDiff) {
                comp++;
            }
            component[arr[i][1]] = comp;
        }

        boolean[] answer = new boolean[queries.length];

        // Answer queries
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];

            answer[i] = (component[u] == component[v]);
        }

        return answer;
    }
}