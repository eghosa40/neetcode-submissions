class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> store = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            store.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int missingInt = target - nums[i];

            if(store.containsKey(missingInt) && store.get(missingInt) != i){
                return new int[]{i, store.get(missingInt)};
            }
        }

        return new int[]{0, 0};
    }
}
