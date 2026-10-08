class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int right = nums.length - 1;
            int left = i + 1;
        
            while(left < right){
                int sum = nums[i] + nums[right] + nums[left];
                if(sum < 0){
                    left++;
                }else if(sum > 0){
                    right--;
                }else{
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[right]);
                    triplet.add(nums[left]);
                    ans.add(triplet);
                    right--; left++;

                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                }
            }
        }
        return ans;
    }
}
