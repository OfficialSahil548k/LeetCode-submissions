class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ans = 0;
        int n = s.length();

        int prevZero = Integer.MIN_VALUE;
        int maxGain = 0;

        int i = 0;
        while (i < n) {
            int j = i + 1;
            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            char ch = s.charAt(i);
            int length = j - i;

            if (ch == '1') {
                ans += length;
            } else if (ch == '0') {
                maxGain = Math.max(maxGain, prevZero + length);
                prevZero = length;
            }

            i = j;
        }
        return ans + maxGain;
    }
}