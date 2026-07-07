class Solution {
    public long sumAndMultiply(int n) {
        int y = 0;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            if (digit != 0) {
                y = (y * 10) + digit;
            }
        }
        int x = 0;
        while (y > 0) {
            x = (x * 10) + (y % 10);
            sum = sum + (y % 10);
            y = y / 10;
        }

        return 1L * x * sum;
    }
}