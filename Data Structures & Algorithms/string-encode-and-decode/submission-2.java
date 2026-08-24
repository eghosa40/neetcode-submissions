class Solution {

    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();
        for(String s : strs){
            int len = s.length();
            encode.append(len);
            encode.append('£');
            encode.append(s);
        }
        String encoded = new String(encode);
        return encoded;
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> decoded = new ArrayList<>();
        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '£'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            int start = j + 1;
            int end = start + len;

            String subString = str.substring(start, end);
            decoded.add(subString);

            i = end;
        }
        
        return decoded;
    }
}
