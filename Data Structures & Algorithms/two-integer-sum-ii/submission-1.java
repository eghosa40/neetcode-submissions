class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int a = 0;
        int b = n - 1;

        while (a < b){
            if(target > numbers[a] + numbers[b]){
                a++;
            } else if(target < numbers[a] + numbers[b]){
                b--;
            } else {
                return new int[]{(a + 1), (b + 1)};
            }
        }
        return new int[]{0, 0};
    }
}
