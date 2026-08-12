class Solution {
    public int[] twoSum(int[] nums, int target) {
        //The key is the element and the value is the index from nums
        Map<Integer, Integer> map = new HashMap<>();

        //first we fill up the hash Map
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        //then we find the element in the hashmaps that matches
        //by going through the array until it matches with the maps keys and val != index
        //if its not that element onto the next, if it is then return the index array of size 2

        for(int i = 0; i < nums.length; i++){
            int ans = target - nums[i];
            if(map.containsKey(ans) && map.get(ans) != i){
                return new int[]{i, map.get(ans)};
            }
        }
        return new int[0];
    }
}
