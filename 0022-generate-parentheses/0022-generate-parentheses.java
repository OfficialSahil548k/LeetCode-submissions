class Solution {
    private void backtrack(int n, int open, int close, List<String> ans, StringBuilder currStr) {
        // base case
        if (currStr.length() == 2 * n) {
            ans.add(currStr.toString());
            return;
        }

        //open
        if (open < n) {
            currStr.append('(');
            backtrack(n, open + 1, close, ans, currStr);
            currStr.deleteCharAt(currStr.length() - 1);
        }

        //close
        if (close < open) {
            currStr.append(')');
            backtrack(n, open, close + 1, ans, currStr);
            currStr.deleteCharAt(currStr.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(n, 0, 0, ans, new StringBuilder());
        return ans;
    }
}