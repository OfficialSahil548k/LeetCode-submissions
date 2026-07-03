class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);

            max = Math.max(max,map.get(nums[i]));
        }

        int ans = 0;
        for(int key : map.keySet()){
            if(map.get(key)==max){
                ans += map.get(key);
            }
        }

        return ans;
    }
}