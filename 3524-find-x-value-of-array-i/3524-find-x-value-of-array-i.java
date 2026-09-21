class Solution {
    public long[] resultArray(int[] nums, int k) {

        long[] result = new long[k];
        long[] dp = new long[k];

        for (int num : nums) {

            long[] newDp = new long[k];

            for (int r = 0; r < k; r++) {
                if (dp[r] > 0) {

                    int newRemainder =
                        (int)(((long) r * num) % k);

                    newDp[newRemainder] += dp[r];
                }
            }

            // Start new subarray [num]
            newDp[num % k]++;

            // Add all current subarrays to answer
            for (int r = 0; r < k; r++) {
                result[r] += newDp[r];
            }

            dp = newDp;
        }

        return result;
    }
}