class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       //store the freq of each element
       //sort out the elemetns by frequency
       //return the output

        Map<Integer, Integer> freq = new HashMap<>();
        PriorityQueue<int[]> stack = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]
        );

        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for(int i : freq.keySet()){
            stack.offer(new int[]{i, freq.get(i)});
            if (stack.size() > k){
                stack.poll();
            }
        }

        int[] ans = new int[k]; 
        //we use the stack size here and not k because the stack size has been set equal to k already
        for(int i = 0; i < k; i++){
            ans[i] = stack.poll()[0];
        }

        return ans;
    }
}
