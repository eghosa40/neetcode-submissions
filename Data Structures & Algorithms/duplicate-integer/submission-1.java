class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int n : nums){
            if (l.contains(n)) return true;

            l.add(n);
        }

        return false;

    }
}