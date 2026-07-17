class Solution {
    private int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    private int binarySearch(long[] prefix, long query) {
        int left = 1;
        int right = prefix.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (prefix[mid] > query) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public int[] gcdValues(int[] nums, long[] queries) {
        // find max
        int maxVal = max(nums);

        // create freq. array for each element
        int[] freq = new int[maxVal + 1];
        for (int x : nums) {
            freq[x] += 1;
        }

        // store pairs by checking divisibility with g
        long[] gcdCount = new long[maxVal + 1];

        for (int g = maxVal; g >= 1; g--) {

            int count = 0;

            for (int multiple = g; multiple <= maxVal; multiple += g) {
                count += freq[multiple];
            }

            long pairs = (long) count * (count - 1) / 2;

            gcdCount[g] = pairs;

            // subtract the same count from multiples 
            for (int multiple = 2 * g; multiple <= maxVal; multiple += g) {
                gcdCount[g] -= gcdCount[multiple];
            }
        }

        // generate the prefix sum array
        long[] prefix = new long[maxVal + 1];

        for (int g = 1; g <= maxVal; g++) {
            prefix[g] = prefix[g - 1] + gcdCount[g];
        }


        // compute answer by using binary search
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            answer[i] = binarySearch(prefix, queries[i]);
        }

        return answer;

    }
}