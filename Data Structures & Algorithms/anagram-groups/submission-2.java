class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> store = new HashMap<>();

        for(String s : strs){
            char[] charString = s.toCharArray();
            Arrays.sort(charString);

            String sortedString = new String(charString);

            store.putIfAbsent(sortedString, new ArrayList<>());
            store.get(sortedString).add(s);
        }

        return new ArrayList<>(store.values());
    }
}
