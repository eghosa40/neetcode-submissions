class Solution {
    public boolean isAnagram(String s, String t) {
        char[] tChar = t.toCharArray();
        char[] sChar = s.toCharArray();

        Arrays.sort(tChar);
        Arrays.sort(sChar);

        String tSorted = new String(tChar);
        String sSorted = new String(sChar);

        return sSorted.equals(tSorted);
    }
}
