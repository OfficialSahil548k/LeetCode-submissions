class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();

        for (String str : tokens) {
            if (str.equals("+") || str.equals("-") ||
                str.equals("*") || str.equals("/")) {

                int d2 = st.pop();
                int d1 = st.pop();

                switch (str) {
                    case "+" -> st.push(d1 + d2);
                    case "-" -> st.push(d1 - d2);
                    case "*" -> st.push(d1 * d2);
                    case "/" -> st.push(d1 / d2);
                }

            } else {
                st.push(Integer.parseInt(str));
            }
        }

        return st.pop();
    }
}