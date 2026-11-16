class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int output = 0;
        for(int i = 0; i < nums.length; i++){
            int a = nums[i];
            if(!set.contains(a - 1)){
                int counter = 1;
                while(set.contains(a + 1)){
                    counter++;
                    a++;
                }
                output = Math.max(output, counter);
            }
        }
        return output;
    }
}
