class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> seen = new HashMap<>();

        for(int i : nums){
            if(seen.containsKey(i)){
                return true;
            } else {
                seen.put(i, seen.getOrDefault(i, 0));
            }
        }
        return false;
    }
}