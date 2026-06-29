class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }else{
            HashMap<Character, Character> map = new HashMap<>();
            for(int i = 0; i<s.length(); i++){
            char a = s.charAt(i);
            char match = t.charAt(i);
            if(map.containsKey(a)){
                if(!map.get(a).equals(match)) return false;
            }
            else if(map.containsValue(match)){
                return false;
            }
            map.put(a, match);
        }
        }
        return true;
    }
}