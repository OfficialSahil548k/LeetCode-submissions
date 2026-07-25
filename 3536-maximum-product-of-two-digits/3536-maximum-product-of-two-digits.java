class Solution {
    public int maxProduct(int n) {
        String s = Integer.toString(n);
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int d1 = s.charAt(i) - '0';
            for (int j = i + 1; j < s.length(); j++) {
                int d2 = s.charAt(j) - '0';
                max = Math.max(max, d1 * d2);
            }
        }

        return max;
    }
}