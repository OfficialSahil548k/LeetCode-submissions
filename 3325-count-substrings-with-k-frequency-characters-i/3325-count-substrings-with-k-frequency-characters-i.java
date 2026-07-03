class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();

        if (k == 1) {
            return (n * (n + 1)) / 2;
        }

        int[] freq = new int[26];
        int left = 0;
        int count = 0;

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            freq[ch - 'a']++;

            while (freq[ch - 'a'] >= k) {
                count += (n - right);

                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }
}