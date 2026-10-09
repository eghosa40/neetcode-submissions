class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            int a = temperatures[i];
            
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && temperatures[stack.peek()] < a){
                    ans[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }else{
                stack.push(i);
            }
        }
        return ans;
    }
}
