class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();
        int answer = 0;

        for(int i : nums){
            store.add(i);
        }

        for(int i : nums){
            if(!store.contains(i - 1)){
                int length = 1;

                while(store.contains(i + length)){
                    length++;
                }

            answer = Math.max(answer, length);
            }
        }
        return answer;
    }
}
