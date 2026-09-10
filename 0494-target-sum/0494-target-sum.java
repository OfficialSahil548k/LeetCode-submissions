class Solution {
    private int subarraySum(int[] nums, int k) { 

        int n = nums.length; 
        int[][] dp = new int[n + 1][k + 1]; 
        
        for (int i = 0; i <= n; i++) { 
            int[] t = new int[k + 1]; 
            Arrays.fill(t, 0); 
            dp[i] = t; 
        } 
        dp[n][0] = 1; 
        
        for (int i = n - 1; i >= 0; i--) { 
            for (int j = 0; j <= k; j++) { 
                if (nums[i] > j) { 
                    dp[i][j] = dp[i + 1][j]; 
                } else { 
                    dp[i][j] = dp[i + 1][j - nums[i]] + dp[i + 1][j]; 
                } 
            } 
        } 
        
        return dp[0][k]; 
    }

    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for(int i=0; i<nums.length; i++){
            totalSum += nums[i];
        }

        int sum = (totalSum + target) / 2;
        if(Math.abs(target) > totalSum || (totalSum + target) % 2 == 1){
            return 0;
        }else{
            return subarraySum(nums, sum);
        }
    }
}