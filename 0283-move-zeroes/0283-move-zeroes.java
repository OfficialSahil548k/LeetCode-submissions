class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int count = 0;
        int idx = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                count += 1;
            }else{
                temp[idx++] = nums[i];
            }
        }
        for(int i=1; i<=count; i++){
            temp[idx++] = 0;
        }

        for(int i=0; i<n; i++){
            nums[i] = temp[i];
        }
    }
}