class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int idx = 0;
        ans[idx] = nums[0];
        for(int i=0; i<n; i++){
            if(nums[i] != ans[idx]){
                idx += 1;
                ans[idx] = nums[i];
            }
        }
        for(int i=0; i<=idx; i++){
            nums[i] = ans[i];
        }
        return idx+1;
    }
}