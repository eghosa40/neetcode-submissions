class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> poland = new ArrayDeque<>();
        for(String c : tokens){
            if(c.equals("+") && !poland.isEmpty()){
                int int2 = poland.pop();
                int int1 = poland.pop();

                int product = int1 + int2;
                poland.push(product);

            }else if(c.equals("-") && !poland.isEmpty()){
                int int2 = poland.pop();
                int int1 = poland.pop();

                int product = int1 - int2;
                poland.push(product);

            }else if(c.equals("*") && !poland.isEmpty()){
                int int2 = poland.pop();
                int int1 = poland.pop();

                int product = int1 * int2;
                poland.push(product);

            }else if(c.equals("/") && !poland.isEmpty()){
                int int2 = poland.pop();
                int int1 = poland.pop();

                int product = int1 / int2;
                poland.push(product);
            }else{
                poland.push(Integer.parseInt(c));
            }
        }

        return poland.peek();
    }
}
