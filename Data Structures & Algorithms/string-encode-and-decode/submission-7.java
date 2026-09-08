class Solution {

    public String encode(List<String> strs) {
        StringBuilder word = new StringBuilder();

        for (String s : strs) {
            int n = s.length();
            word.append(n);
            word.append("&");
            word.append(s);
        }

        return word.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> list = new ArrayList<>();

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '&') {
                j++;
            }

            int n = Integer.parseInt(str.substring(i, j));

            int start = j + 1;
            int end = start + n;

            list.add(str.substring(start, end));
            i = end;
        }

        return list;
    }
}
