class Solution {
    public int findMin(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // Minimum is in left half
            if (nums[mid] < nums[high]) {
                high = mid;
            }

            // Minimum is in right half
            else if (nums[mid] > nums[high]) {
                low = mid + 1;
            }

            // Duplicates
            else {
                high--;
            }
        }

        return nums[low];
    }
}