class Solution {
    private int nextGreater(int n, int[] nums2){
        int i = 0;
        while(nums2[i] != n){
            i++;
        }
        while(i < nums2.length - 1){
            if(nums2[i+1]>n) return nums2[i+1];
            i++;
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            int ng = nextGreater(nums1[i],nums2);
            ans[i] = ng;
        }

        return ans;
    }
}