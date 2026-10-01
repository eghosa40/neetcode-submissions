class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        HashSet<Integer> store = new HashSet<>();
        for(int i : nums){
            store.add(i);
        }

        for(int i = 0; i < nums.length; i++){
            int a = nums[i];
            int len = 1;
            if(store.contains(a) && !store.contains(a - 1)){
                while(store.contains(a + 1)){
                    len++;
                    a++;
                }
            }

            count = Math.max(count, len);
        }
        return count;
    }
}
