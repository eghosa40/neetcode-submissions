class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Keep count of elements
        //Then compare which one is more frequent than others
        //Or somehow keep track of which elements are the most frequent
        //Return K most frquent elements

        Map<Integer, Integer> freq = new HashMap<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]
        );

        //get a count of the frequent elements
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for (int n : freq.keySet()){
            //compare and keep the most frequent elements
            heap.offer(new int[]{n, freq.get(n)});
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++){
            ans[i] = heap.poll()[0];
        }

        return ans;
    }
}
