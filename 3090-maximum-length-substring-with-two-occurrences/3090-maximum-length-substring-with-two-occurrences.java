class Solution {
    public int maximumLengthSubstring(String s) {
        int len = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int[] freq = new int[26];
            freq[s.charAt(i) - 'a'] += 1;
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                char ch = s.charAt(j);
                freq[ch - 'a'] += 1;
                if (freq[ch - 'a'] > 2) {
                    break;
                }
                sb.append(ch);
            }

            len = Math.max(len, sb.length());
        }

        return len;
    }
}