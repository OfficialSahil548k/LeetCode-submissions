class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int len = 0;
        int i = n-1;
        while(s.charAt(i) == ' ') i--;

        while(i>=0){
            if(s.charAt(i) == ' ') break;
            len++;
            i--;
        }
        return len;
    }
}