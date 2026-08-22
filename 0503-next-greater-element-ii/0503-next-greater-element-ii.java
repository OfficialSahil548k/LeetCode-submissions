class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ng = new int[n];

        for (int i = 0; i < n; i++) {
            int idx = (i + 1) % n;
            while (idx != i) {
                if (nums[idx] > nums[i]) {
                    ng[i] = nums[idx];
                    break;
                } else {
                    idx = (idx + 1) % n;
                }
            }
            if (idx == i) {
                ng[i] = -1;
            }
        }

        return ng;
    }
}