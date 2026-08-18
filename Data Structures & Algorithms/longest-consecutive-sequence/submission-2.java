class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();
        for(int n : nums){
            store.add(n);
        }

        int answer = 0;

        //for each n of store we check if
        for(int n : store){
            //its the start of a sequence
            if(!store.contains(n - 1)){
                //we create a counter to track the length of the sequence
                int length = 1;
                //we check repeatedly if set contains the next element of the sequence
                while(store.contains(n + length)){
                    length++;
                }
                //We update the longest answer after each iteration (each element of the set)
                answer = Math.max(answer, length);
            }

        }
        return answer;
    }
}
