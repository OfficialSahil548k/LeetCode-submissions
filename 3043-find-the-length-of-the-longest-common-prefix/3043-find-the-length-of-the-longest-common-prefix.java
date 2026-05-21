class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
            while(num>0){
                set.add(num);
                num /= 10;
            }
        }
        int maxLength = 0;
        for(int num : arr2){
            while(num>0){
                if(set.contains(num)){
                    int len = String.valueOf(num).length();
                    maxLength = Math.max(maxLength,len);
                }
                num /= 10;
            }
        }
        return maxLength;
    }
}