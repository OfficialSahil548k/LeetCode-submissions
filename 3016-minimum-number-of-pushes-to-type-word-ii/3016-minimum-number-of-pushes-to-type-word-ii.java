class Solution {
    public int minimumPushes(String word) {
        int n = word.length();

        int[] freq = new int[26];

        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);
        
        int cost = 0;
        int idx = 0;
        for(int i=25; i>=0; i--){
            cost += freq[i] * (idx / 8 + 1);
            idx++;
        }

        return cost;
    }
}