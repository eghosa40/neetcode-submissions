class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Target - element = missing element
        //Then we check in the hash map if theres the missing element
        Map<Integer, Integer> map = new HashMap<>();
        //First loop through the array to save all elements as keys and the value would be the index
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        //Then take the first element following the 0 index and substract it from the target
        for(int i = 0; i < nums.length; i++){
            int missingElement = target - nums[i];

            if(map.containsKey(missingElement) && map.get(missingElement) !=i ){
                return new int[]{i, map.get(missingElement)};
            }
        }
        //Then search for said key
        //If they arent the same index then return the indexes of both elements that add up to target
        //Worse case scenario return false if there's none
        return new int[]{0, 0};
    }
}
