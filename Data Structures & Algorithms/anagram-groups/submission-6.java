class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();
        for(String s : strs){
            char[] sChar = s.toCharArray();
            Arrays.sort(sChar);

            String str = new String(sChar);

            anagram.putIfAbsent(str, new ArrayList<>());
            anagram.get(str).add(s);
        }

        return new ArrayList<>(anagram.values());
    }
}
