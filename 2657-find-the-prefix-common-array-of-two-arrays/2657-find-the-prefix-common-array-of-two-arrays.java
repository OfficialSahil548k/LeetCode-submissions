class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int result[] = new int[A.length];
        int count = 0;
        for(int i=0,j=0; i<A.length && j<B.length; i++, j++){
            if(set1.contains(B[j])){
                count += 1;
            }
            if(set2.contains(A[i])){
                count += 1;
            }
            if(A[i]==B[j]){
                count += 1;
            }
            if(!set1.contains(A[i])){
                set1.add(A[i]);
            }
            if(!set2.contains(B[j])){
                set2.add(B[j]);
            }
            result[i] = count;
        }
        return result;
    }
}