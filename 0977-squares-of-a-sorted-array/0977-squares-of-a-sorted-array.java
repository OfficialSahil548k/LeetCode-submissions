class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int[] ans = new int[nums.length];
        int k = j;
        while(i<j){
            int iSqr = nums[i] * nums[i];
            int jSqr = nums[j] * nums[j];

            if(iSqr > jSqr){
                ans[k--] = iSqr;
                i++;
            }else{
                ans[k--] = jSqr;
                j--;
            }
        }
        ans[0] = nums[i] * nums[i];
        return ans;
    }
}