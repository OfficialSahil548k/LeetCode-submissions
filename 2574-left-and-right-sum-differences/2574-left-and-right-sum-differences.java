class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for(int i=0; i<n; i++){
            int sum1 = 0;
            int j=0;
            while(j<n && j<i){
                sum1 += nums[j];
                j++;
            }

            int sum2 = 0;
            int k=i+1;
            while(k<n && k>i){
                sum2 += nums[k];
                k++;
            }

            if(sum1>sum2){
                result[i] = sum1-sum2;
            }else{
                result[i] = sum2-sum1;
            }
        }

        return result;

    }
}