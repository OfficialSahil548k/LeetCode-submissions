class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int num : nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        while(min != 0){
            int temp = min;
            min = max % min;
            max = temp;
        }
        return Math.abs(max);
    }
}