class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String s : tokens){
            if(s.equals("+") && !stack.isEmpty()){
                int b = stack.pop();
                int a = stack.pop();
                int product = a + b;
                stack.push(product);
            }else if(s.equals("-") && !stack.isEmpty()){
                int b = stack.pop();
                int a = stack.pop();
                int product = a - b;
                stack.push(product);
            }else if(s.equals("*") && !stack.isEmpty()){
                int b = stack.pop();
                int a = stack.pop();
                int product = a * b;
                stack.push(product);
            }else if(s.equals("/") && !stack.isEmpty()){
                int b = stack.pop();
                int a = stack.pop();
                int product = a / b;
                stack.push(product);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.peek();
    }
}
