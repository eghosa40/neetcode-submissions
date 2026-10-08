class Solution {
    public int characterReplacement(String s, int k) {
        int maxFrequency = 0;
        int maxLength = 0;
        int left = 0;
        int[] count = new int[26];

        for(int right = 0; right < s.length(); right++){
            int rightIndex = s.charAt(right);
            count[rightIndex - 'A']++;

            maxFrequency = Math.max(maxFrequency, count[rightIndex - 'A']);

            while((right - left + 1) - maxFrequency > k){
                int leftIndex = s.charAt(left);
                count[leftIndex - 'A']--;
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
