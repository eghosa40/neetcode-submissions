class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> freq = new HashSet<>();

        if(nums.length == 0) return false;

        for(int i = 0; i < nums.length; i++){
            if(!freq.contains(nums[i])){
                freq.add(nums[i]);
            } else{
                return true;
            }
        }

        return false;
    }
}