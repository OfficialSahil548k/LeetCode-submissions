class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int s = 0;
        int p = 1;
        while(num>0){
            int digit = num % 10;
            num = num / 10;
            s += digit;
            p *= digit;
        }

        if(n % (s+p) == 0){
            return true;
        }else{
            return false;
        }
    }
}