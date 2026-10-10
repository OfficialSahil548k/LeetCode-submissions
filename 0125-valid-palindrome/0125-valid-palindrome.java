class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                continue;
            }

            ch = Character.toLowerCase(ch);

            sb.append(ch);
        }
        String newStr = sb.toString();
        int left = 0;
        int right = newStr.length() - 1;
        while (left < right) {
            if (newStr.charAt(left) != newStr.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}