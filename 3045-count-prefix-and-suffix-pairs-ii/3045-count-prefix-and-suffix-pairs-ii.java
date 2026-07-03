class Solution {
    class TrieNode{
        HashMap<String, TrieNode> children = new HashMap<>();
        int count = 0;
    }
    public long countPrefixSuffixPairs(String[] words) {
        TrieNode root = new TrieNode();
        long ans = 0;
        for(String word : words){
            TrieNode curr = root;
            int n = word.length();
            for(int i=0; i<n; i++){
                String key = word.charAt(i) + "#" + word.charAt(n-1-i);
                curr.children.putIfAbsent(key, new TrieNode());

                curr = curr.children.get(key);

                ans += curr.count;
            }
            curr.count++;
        }
        return ans;
    }
}