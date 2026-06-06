class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] result = new int[n];

        for(int i=0; i<n; i++){
            int sum1 = 0;
            int j=0;
            while(j<n && j<i){
                sum1 += nums[j];
                j++;
            }
            leftSum[i] = sum1;

            int sum2 = 0;
            int k=i+1;
            while(k<n && k>i){
                sum2 += nums[k];
                k++;
            }
            rightSum[i] = sum2;

            if(leftSum[i]>rightSum[i]){
                result[i] = leftSum[i]-rightSum[i];
            }else{
                result[i] = rightSum[i]-leftSum[i];
            }
        }

        return result;

    }
}