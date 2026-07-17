class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> list = new HashMap<>();
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        for (char n : a){
            list.put(n, list.getOrDefault(n, 0) + 1);
        }

        for (char n : b){
            int currentCount = list.getOrDefault(n, 0);
            if (currentCount == 0){
                return false;
            }
            else{
                list.put(n, currentCount - 1);
            }
        }
        return true;
    }
}
