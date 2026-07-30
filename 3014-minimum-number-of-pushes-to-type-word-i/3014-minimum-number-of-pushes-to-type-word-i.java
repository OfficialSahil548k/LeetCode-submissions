class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);

        int cost = 0;
        int pushes = 1;
        int count = 0;

        for (int i = 25; i >= 0; i--) {
            cost += freq[i] * pushes;
            count++;

            if (count == 8) {
                pushes++;
                count = 0;
            }
        }

        return cost;
    }
}