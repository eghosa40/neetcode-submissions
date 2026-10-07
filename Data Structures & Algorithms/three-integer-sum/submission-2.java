class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();

        Arrays.sort(nums);

        for(int fixed = 0; fixed < nums.length - 2; fixed++){
            if(fixed > 0 && nums[fixed] == nums[fixed - 1]){
                continue;
            }
            int right = nums.length - 1;
            int left = fixed + 1;

            while(left < right){
                int sum = nums[fixed] + nums[left] + nums[right];
                if(sum < 0){
                    left++;
                }else if(sum > 0){
                    right--;
                }else{
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[fixed]); 
                    triplet.add(nums[left]); 
                    triplet.add(nums[right]);
                    sol.add(triplet);
                    right--; left++;

                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                }
            }
        }
        return sol;
    }
}
