class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        StringBuilder ans = new StringBuilder();
        if(!Character.isDigit(s.charAt(0))){
            ans.append(s.charAt(0));
        }
        for(int i=s.length()-1; i>=0; i--){
            if(Character.isDigit(s.charAt(i))){
                ans.append(s.charAt(i));
            }
        }
        try {
            return Integer.parseInt(ans.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}