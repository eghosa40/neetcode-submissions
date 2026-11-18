class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] sChar = s.toCharArray();
            Arrays.sort(sChar);
            String str = new String(sChar);
            map.putIfAbsent(str, new ArrayList<>());
            map.get(str).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
