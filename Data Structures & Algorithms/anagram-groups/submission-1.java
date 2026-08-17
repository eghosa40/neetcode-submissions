class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        
        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedArr = new String(charArray);

            ans.putIfAbsent(sortedArr, new ArrayList<>());
            ans.get(sortedArr).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
