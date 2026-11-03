class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int i = 0;
        // int j = nums.length - 1;
        // while(i < j){
        //     int sum = nums[i] + nums[j];
        //     if(sum < target){
        //         i++;
        //     }else if(sum > target){
        //         j--;
        //     }else{
        //         return new int[]{i, j};
        //     }
        // }
        // return new int[]{};

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.putIfAbsent(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int missingInt = target - nums[i];
            if(map.containsKey(missingInt) && map.get(missingInt) != i){
                if(map.get(missingInt) < i){
                   return new int[]{map.get(missingInt), i}; 
                }else{
                    return new int[]{i, map.get(missingInt)};
                }
            }
        }
        return new int[]{};
    }
}
