class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            int d = nums[i];
            ans[i] = d * d;
        }
        Arrays.sort(ans);
        return ans;
    }
}