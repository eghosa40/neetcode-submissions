class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> closedToOpen = new HashMap<>();
        closedToOpen.put('}', '{');
        closedToOpen.put(']', '[');
        closedToOpen.put(')', '(');

        int i = 0;
        while(i < s.length()){
            if(!stack.isEmpty() && stack.peek() == closedToOpen.get(s.charAt(i))){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
            i++;
        }

        return stack.isEmpty();
    }
}
