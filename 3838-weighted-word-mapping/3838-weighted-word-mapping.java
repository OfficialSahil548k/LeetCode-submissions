class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char[] letters = {'a', 'b', 'c', 'd', 
        'e','f', 'g', 'h', 'i', 'j', 
        'k', 'l', 'm', 'n', 'o', 'p', 
        'q','r', 's', 't', 'u', 'v', 
        'w','x', 'y', 'z'};
        int n = letters.length;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Integer,Character> map2 = new HashMap<>();

        for(int i=0; i<26; i++){
            map1.put(letters[i],weights[i]);
            map2.put(i,letters[n-1-i]);
        }
        
        StringBuilder ans = new StringBuilder();
        for(String word : words){
            int result = 0;
            for(int i=0; i<word.length(); i++){
                result += map1.get(word.charAt(i));
            }
            ans.append(map2.get(result%26));;
        }
        return ans.toString();
    }
}