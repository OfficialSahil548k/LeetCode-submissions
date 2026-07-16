class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long gcdSum(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        int[] prefixGCD = new int[n];

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            prefixGCD[i] = gcd(nums[i], max);
        }
        Arrays.sort(prefixGCD);

        long sum = 0;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            sum += gcd(prefixGCD[i], prefixGCD[j]);
            i++;
            j--;
        }

        return sum;
    }
}