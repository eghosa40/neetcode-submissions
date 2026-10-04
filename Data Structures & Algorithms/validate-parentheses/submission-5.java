class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> closedToOpen = new HashMap<>();

        closedToOpen.put('}', '{');
        closedToOpen.put(']', '[');
        closedToOpen.put(')', '(');

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && closedToOpen.containsKey(c)){
                if(stack.peek() != closedToOpen.get(c)){
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
