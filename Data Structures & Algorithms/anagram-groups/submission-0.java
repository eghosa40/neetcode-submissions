class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs){
            //break down the word into its characters
            char[] chars = s.toCharArray();

            //Sort the characters alphabetically
            Arrays.sort(chars);

            //Turn it back into a string called key which would be the "mold"
            String key = new String(chars);
            
            //Get the existing list for that key (or make a new list if new)
            List<String> list = map.getOrDefault(key, new ArrayList());

            //Add the current word s to that list
            list.add(s);

            //Put the updated list back in the map under that key
            map.put(key, list);

        }
        return new ArrayList<>(map.values());
    }
}
