class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length - 1;
        int left = 0;

        while (right > left){
            int product = numbers[right] + numbers[left];
            if(product < target){
                left++;
            }else if(product > target){
                right--;
            }else{
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{};
    }
}
