class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;
        int width = 0;
        int hght = 0;
        while (left < right) {
            width = right - left;
            if (height[left] < height[right]) {
                hght = height[left];
                left++;
            } else if (height[left] > height[right]) {
                hght = height[right];
                right--;
            } else {
                hght = height[left];
                left++;
                right--;
            }

            int currWater = width * hght;
            maxWater = Math.max(maxWater, currWater);
        }

        return maxWater;
    }
}