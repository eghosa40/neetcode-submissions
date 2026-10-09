class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int missInt = target - nums[i];

            if(map.containsKey(missInt) && i != map.get(missInt)){
                return new int[]{i, map.get(missInt)};
            }
        }
        return new int[]{};
    }
}
