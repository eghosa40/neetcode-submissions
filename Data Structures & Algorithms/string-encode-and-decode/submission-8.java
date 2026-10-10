class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s : strs){
            char[] c = s.toCharArray();
            int len = c.length;
            str.append(len);
            str.append('&');
            str.append(s);
        }
        String encoded = str.toString();
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int len = str.length();
        int right = 0; int left = 0;
        while(right < len){
            while(str.charAt(right) != '&'){
                right++;
            }
            int n = Integer.parseInt(str.substring(left, right));
            left = right + 1;
            right = n + left;
            ans.add(str.substring(left, right));
            left = right;
        }
        return ans;
    }
}
