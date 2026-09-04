class Solution {

    public String encode(List<String> strs) {
        StringBuilder word = new StringBuilder();
        for(String s : strs){
            int len = s.length();
            word.append(len);
            word.append("&");
            word.append(s);
        }
        String encoded = new String(word);
        return encoded;
    }

    public List<String> decode(String str) {
        ArrayList<String> ans = new ArrayList<>();
        
        int i = 0;
        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '&'){
                j++;
            }

            int n = Integer.parseInt(str.substring(i, j));

            int start = j + 1;
            int end = start + n;

            ans.add(str.substring(start, end));
            i = end;
        }
        return new ArrayList<>(ans);
    }
}
