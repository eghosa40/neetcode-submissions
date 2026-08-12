class Solution {
    public boolean isAnagram(String s, String t) {
        //Logic check legth and then character count
        int lens = s.length();
        int lent = t.length();

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);
        
        return Arrays.equals(tChar, sChar);
    }
}
