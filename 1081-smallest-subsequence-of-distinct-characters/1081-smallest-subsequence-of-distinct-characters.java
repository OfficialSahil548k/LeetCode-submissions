class Solution {
    public String smallestSubsequence(String s) {

        boolean[] visited = new boolean[26];
        Stack<Character> st = new Stack<>();
        int[] lstOcc = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            lstOcc[ch - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (visited[idx])
                continue;

            while (!st.isEmpty()) {
                if ((st.peek() > ch) && lstOcc[st.peek() - 'a'] > i) {
                    visited[st.peek() - 'a'] = false;
                    st.pop();
                } else {
                    break;
                }
            }
            st.push(ch);
            visited[idx] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}