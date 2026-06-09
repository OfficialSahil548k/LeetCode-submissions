class Solution {
    public int max(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public int min(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public long maxTotalValue(int[] nums, int k) {
        int max = max(nums);
        int min = min(nums);
        return 1L*k*(max-min);
    }
}