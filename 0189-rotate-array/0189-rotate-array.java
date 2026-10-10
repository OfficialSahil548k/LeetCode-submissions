class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == 0 || n == 1) return;

        k = k % n;
        if(k==0) return;
        int[] temp = new int[k];

        for(int i=0; i<k; i++){
            temp[i] = nums[n-1-i];
        }

        int[] newArr = new int[n];

        for(int i=0; i<k; i++){
            newArr[i] = temp[k-1-i];
        }
        for(int i=0; i<n-k; i++){
            newArr[k+i] = nums[i];
        }
        for(int i=0; i<n; i++){
            nums[i] = newArr[i];
        }

        return;
    }
}