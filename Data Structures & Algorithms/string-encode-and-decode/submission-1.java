class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s : strs){
            int length = s.length();
            str.append(length);
            str.append('£');
            str.append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        int i = 0;

        List<String> answer = new ArrayList<>();

        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '£'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            int start = j + 1;
            int end = start + length;

            String subString = str.substring(start, end);
            answer.add(subString);
            
            i = end;
        }
        return answer;

    }
}
