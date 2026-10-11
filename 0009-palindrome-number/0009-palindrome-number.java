class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int n = x;
        int m = 0;
        while(n>0){
            int d = n % 10;
            m = m*10 + d;
            n = n/10;
        }
        if(m != x){
            return false;
        }
        return true;
    }
}