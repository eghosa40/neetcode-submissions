class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(!stack.isEmpty()){
                    if(stack.peek() != map.get(c)){
                        return false;
                    }else{
                        stack.pop();
                    }
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
