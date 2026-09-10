class Solution {
    private boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        
        boolean[][] dp = new boolean[n + 1][sum + 1];
        dp[n][0] = true;
        
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=sum; j++){
                if(arr[i] > j){
                    dp[i][j] = dp[i+1][j];
                }else{
                    dp[i][j] = dp[i+1][j-arr[i]] || dp[i+1][j];
                }
            }
        }
        
        return dp[0][sum];
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        if(sum%2==1) return false;
        return isSubsetSum(nums, sum/2);
    }
}