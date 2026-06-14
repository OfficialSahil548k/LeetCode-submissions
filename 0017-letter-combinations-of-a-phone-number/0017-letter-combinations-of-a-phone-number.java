class Solution {
    private void backtrack(List<String> result, int index, StringBuilder curr, String[] map, String digits){
        if(index==digits.length()){
            result.add(curr.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = map[digit];

        for(int i=0; i<letters.length(); i++){
            curr.append(letters.charAt(i));
            backtrack(result, index+1, curr, map, digits);
            curr.deleteCharAt(curr.length()-1); // backtrack
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits==null || digits.length()==0){
            return result;
        }
        String[] map = {
            "", "", "abc",
            "def", "ghi", "jkl",
            "mno", "pqrs", "tuv",
            "wxyz"
        };
        
        backtrack(result, 0, new StringBuilder(), map, digits);
        return result;
    }
}