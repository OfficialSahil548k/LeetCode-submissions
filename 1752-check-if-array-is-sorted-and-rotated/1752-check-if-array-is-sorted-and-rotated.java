class Solution {
    public boolean check(int[] nums) {

        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // circular next index
            int next = (i + 1) % n;

            if (nums[i] > nums[next]) {
                count++;
            }

            // more than one drop
            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}