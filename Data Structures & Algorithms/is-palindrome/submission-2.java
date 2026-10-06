class Solution {
    public boolean isPalindrome(String s) {
        int r = s.length() - 1;
        int l = 0;

        while(l < r){
            while(l < r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            while(l < r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            if(Character.toLowerCase(s.charAt(r)) != Character.toLowerCase(s.charAt(l))){
                return false;
            }
            l++; r--;
        }
        return true;
    }
}
