class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int bal = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left<nums.length && left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int newBal = Math.abs(target - sum);
                if (bal > newBal) {
                    ans = sum;
                    bal = newBal;
                }
                if (sum == target) {
                    return ans;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}