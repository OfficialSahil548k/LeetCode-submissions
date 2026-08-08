class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] ans = new int[queries.length];

        List<Integer> positions = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                positions.add(i);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int occurrence = queries[i];

            if (occurrence > positions.size()) {
                ans[i] = -1;
            } else {
                ans[i] = positions.get(occurrence - 1);
            }
        }

        return ans;
    }
}