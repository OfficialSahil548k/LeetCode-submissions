class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for( int x : nums1){
                set.add(x);
        }

        int min = Integer.MAX_VALUE;

        for(int y : nums2){
            if(set.contains(y)){
                min = Math.min(min,y);
            }
        }

        if(min==Integer.MAX_VALUE){
            return -1;
        }else{
            return min;
        }
    }
}