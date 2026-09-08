class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>(); 
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            map.put(i, temperatures[i]);
        }
        
        for(int i = 0; i < n; i++){            
            while(!stack.isEmpty() && temperatures[i] > map.get(stack.peek())){
                int prevDay = stack.peek();
                ans[prevDay] = i - prevDay;
                stack.pop();
            }
            stack.push(i);
        }
        return ans;
    }
}
