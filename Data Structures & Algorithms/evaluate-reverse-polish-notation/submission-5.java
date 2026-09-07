class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(String s : tokens){
            if(s.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                int product = a + b;
                stack.push(product);
            }
            else if(s.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                int product = a - b;
                stack.push(product);
            }
            else if(s.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                int product = a * b;
                stack.push(product);
            }
            else if(s.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                int product = a / b;
                stack.push(product);
            }
            else{
                int num = Integer.parseInt(s);
                stack.push(num);
            }
       }
       return stack.peek();
    }
}
