class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long ans = 0;

        while (a >= b) {

            long temp = b;
            int shift = 0;

            while ((temp << 1) <= a) {
                temp <<= 1;
                shift++;
            }

            a -= temp;
            ans += 1L << shift;
        }

        if (negative) {
            ans = -ans;
        }

        return (int) ans;
    }
}