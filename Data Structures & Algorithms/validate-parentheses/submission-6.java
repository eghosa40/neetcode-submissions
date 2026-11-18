class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>();

        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        for(char c : s.toCharArray()){
            if(!stack.isEmpty()){
                if(map.containsKey(c) && stack.peek() == map.get(c)){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
            else{
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
