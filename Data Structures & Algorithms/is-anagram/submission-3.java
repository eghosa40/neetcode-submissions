class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> s1 = new HashMap<>();
        Map<Character, Integer> s2 = new HashMap<>();

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        for (char c : a){
            s1.put(c, s1.getOrDefault(c, 0) + 1);
        }

        for(char c : b){
            s2.put(c, s2.getOrDefault(c, 0) + 1);
        }

        if(s1.equals(s2)){
            return true;
        } else{
            return false;
        }
    }
}
