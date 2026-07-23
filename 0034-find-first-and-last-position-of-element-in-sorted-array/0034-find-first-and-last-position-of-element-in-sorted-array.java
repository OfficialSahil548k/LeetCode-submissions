class Solution {
    private int start(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int ans = -1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                ans = mid;
                j = mid - 1;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
            return ans;
    }

    private int end(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int ans = -1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                ans = mid;
                i = mid + 1;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
            return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{
            start(nums,target),
            end(nums,target)
        };
    }
}