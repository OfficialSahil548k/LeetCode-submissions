class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();

        if (k == 1) {
            return (n * (n + 1)) / 2;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            freq[s.charAt(i) - 'a']++;

            if (freq[s.charAt(i) - 'a'] >= k) {
                count += n - i;
                continue;
            }

            int j = i + 1;

            while (j < n) {
                char ch = s.charAt(j);
                freq[ch - 'a']++;

                if (freq[ch - 'a'] >= k) {
                    count += (n - j);
                    break;
                } else {
                    j++;
                }
            }
        }

        return count;
    }
}