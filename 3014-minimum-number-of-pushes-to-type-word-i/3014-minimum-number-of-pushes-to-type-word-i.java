class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int part = n / 8;
        int left = n % 8;

        return (part * (part + 1) * 4 + (part + 1) * left);
    }
}