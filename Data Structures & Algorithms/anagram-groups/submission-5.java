class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        for(String s : strs){
            char[] sChar = s.toCharArray();
            Arrays.sort(sChar);
            String sortedArr = new String(sChar);
            group.putIfAbsent(sortedArr, new ArrayList<>());
            group.get(sortedArr).add(s);
        }

        return new ArrayList<>(group.values());
    }
}
