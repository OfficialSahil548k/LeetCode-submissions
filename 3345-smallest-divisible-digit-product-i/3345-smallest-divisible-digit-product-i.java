class Solution {
    private int product(int n, int pdt){
        while(n>0){
            pdt *= n % 10;
            n = n / 10;
        }
        return pdt;
    }
    public int smallestNumber(int n, int t) {
        while(product(n,1) % t != 0){
            n = n + 1;
        }
        return n;
    }
}