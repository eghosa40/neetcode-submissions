class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        int i = 0;
        while(i < nums.length){
            int missingInt = target - nums[i];
            if(map.containsKey(missingInt) && map.get(missingInt) != i){
                return new int[]{i, map.get(missingInt)};   
            }else{
                i++;
            }
        }
        return new int[]{0, 0};
    }
}
