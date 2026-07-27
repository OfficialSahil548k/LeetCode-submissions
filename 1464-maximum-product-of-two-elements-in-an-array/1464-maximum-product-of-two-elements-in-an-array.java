class Solution {
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            int val = nums[i] - 1;
            if(val >= max1){
                max2 = max1;
                max1 = val;
            }else if(val >= max2){
                max2 = val;
            }
        }

        return max1 * max2;
    }
}