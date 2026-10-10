class Solution {
    public boolean isPalindrome(String s) {
        int sp = 0; 
        int ep = s.length() - 1;
        boolean ans = true;
        while(sp<ep){
            if(!Character.isLetterOrDigit(s.charAt(sp))){
                sp++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(ep))){
                ep--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(sp)) != Character.toLowerCase(s.charAt(ep))){
                ans = false;
                break;
            }

            sp++;
            ep--;
        }

        return ans;
    }
}