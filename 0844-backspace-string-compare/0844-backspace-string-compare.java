class Solution {
    public boolean backspaceCompare(String s, String t) {
        // for string 's'
        Deque<Character> st1 = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '#') {
                st1.push(ch);
            } else {
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
        }
        StringBuilder str1 = new StringBuilder();
        while (!st1.isEmpty()) {
            str1.append(st1.pop());
        }

        // for string 't'
        Deque<Character> st2 = new ArrayDeque<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch != '#') {
                st2.push(ch);
            } else {
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }
        }
        StringBuilder str2 = new StringBuilder();
        while (!st2.isEmpty()) {
            str2.append(st2.pop());
        }

        return str1.toString().equals(str2.toString());
    }
}