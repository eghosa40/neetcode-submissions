class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        int[] count = new int[26];

        for(int r = 0; r < s.length(); r++){
            int rightIndx = s.charAt(r) - 'A';
            count[rightIndx]++;

            maxFreq = Math.max(maxFreq, count[rightIndx]);

            while((r - left + 1) - maxFreq > k){
                int leftIndx = s.charAt(left) - 'A';
                count[leftIndx]--;

                left++;
            }

            maxLen = Math.max(maxLen, (r - left + 1));
        }
        return maxLen;
    }
}
