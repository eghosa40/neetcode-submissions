class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> ans = new ArrayDeque<>();
        for(String c : tokens){
            if(c.equals("+")){
                int b = ans.pop();
                int a = ans.pop();
                ans.push(a + b);

            }else if(c.equals("-")){
                int b = ans.pop();
                int a = ans.pop();
                ans.push(a - b);
            }else if(c.equals("*")){
                int b = ans.pop();
                int a = ans.pop();
                ans.push(a * b);
            }else if(c.equals("/")){
                int b = ans.pop();
                int a = ans.pop();
                ans.push(a / b);
            }else{
                int num = Integer.parseInt(c);
                ans.push(num);
            }
        }
        return ans.pop();
    }
}
