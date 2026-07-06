class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        boolean[] covered = new boolean[n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == j) continue;

                if (intervals[j][0] <= intervals[i][0] &&
                    intervals[j][1] >= intervals[i][1]) {

                    covered[i] = true;
                    break;
                }
            }
        }

        int count = 0;

        for (boolean c : covered) {
            if (!c) count++;
        }

        return count;
    }
}