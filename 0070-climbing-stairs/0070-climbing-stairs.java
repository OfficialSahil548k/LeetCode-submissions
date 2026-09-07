class Solution {
    Map<Integer, Integer> dp = new HashMap<>();

    private int count(int i, int n) {
        if (i == n)
            return 1;
        if (i > n)
            return 0;

        if (dp.containsKey(i)) {
            return dp.get(i);
        }

        int result = count(i + 1, n) + count(i + 2, n);

        dp.put(i, result);

        return result;
    }

    public int climbStairs(int n) {
        return count(0, n);
    }
}