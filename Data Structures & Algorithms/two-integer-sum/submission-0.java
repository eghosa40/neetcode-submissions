class Solution {
    public int[] twoSum(int[] nums, int target) {
        //target - smallestNum = biggerNum
        Map<Integer, Integer> map = new HashMap<>();
        
        //check for the difference element

        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if (map.containsKey(difference)){
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);

        }
        return new int[]{};
    }
}
