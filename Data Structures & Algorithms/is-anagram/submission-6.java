class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()){
            return false;
        }
        
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        for(char c = 0; c < s.length(); c++){
            smap.merge(s.charAt(c), 1, Integer::sum);
            tmap.merge(t.charAt(c), 1, Integer::sum);
        }

        for(char c : smap.keySet()){
            if(!Objects.equals(smap.get(c), tmap.get(c))){
                return false;
            }
        }
        return true;
    }
}
