class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> store = new HashSet<>();
        int left = 0;
        int right = 0;
        int ans = 0;

        while(left <= right && right < s.length()){
            if(store.contains(s.charAt(right))){
                store.remove(s.charAt(left));
                left++;

            }else{
                store.add(s.charAt(right));
                right++;

            }
            ans = Math.max(ans, (right - left));
        }
        return ans;
    }
}
