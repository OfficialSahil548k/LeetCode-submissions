class Solution {
    public boolean isPalindrome(int x) {
        String s = x+"";
        boolean status = true;

        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                status = false;
            }
        }
        return status;
    }
}