class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedArr = new String(charArr);
            map.putIfAbsent(sortedArr, new ArrayList<>());
            map.get(sortedArr).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
