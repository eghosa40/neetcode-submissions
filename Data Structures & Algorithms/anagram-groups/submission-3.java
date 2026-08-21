class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> dictionary = new HashMap<>();

        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);

            String sortedString = new String(charArray);

            dictionary.putIfAbsent(sortedString, new ArrayList<>());
            dictionary.get(sortedString).add(s);
        }
        return new ArrayList<>(dictionary.values());
    }
}
