class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> set = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            set.put(numbers[i], i);
        }

        for(int i = 0; i < numbers.length; i++){
            int missingInt = target - numbers[i];

            if(set.containsKey(missingInt) && set.get(missingInt) != i){
                return new int[]{i + 1, set.get(missingInt) + 1};
            }
        }

        return new int[]{};
    }
}
