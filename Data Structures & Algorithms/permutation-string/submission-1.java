class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int[] freq2 = new int[26];

        if(s1.length() > s2.length()){
            return false;
        }

        for(int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(freq, freq2)){
            return true;
        }

        for(int right = s1.length(); right < s2.length(); right++){
            freq2[s2.charAt(right) - 'a']++;

            int left = right - s1.length();
            freq2[s2.charAt(left) - 'a']--;

            if(Arrays.equals(freq, freq2)){
                return true;
            }
        }
        return false;
    }
}
