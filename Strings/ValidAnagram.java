class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> characters = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            characters.put(s.charAt(i), characters.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0; i<t.length(); i++){
            characters.put(t.charAt(i), characters.getOrDefault(t.charAt(i), 0) - 1);
        }
        for(Integer value : characters.values()){
            if(value != 0){
                return false;
            }
        }
        
        return true;
    }
}