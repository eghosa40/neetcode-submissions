class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //1 Read the array
        //2 From each element compare the next element
        //3 If greater or lesser
        //4 If greater then count the distance of indexes
        //5 Put this in a new array in the same index position from the lesser element
        //6 If lesser keep checking the next element until we find our greater
        //7 Put this in the new array in the same index position from the lesser element
        //Repeat 6 & 7 until the last element
        //If no more elements then the answer array should hold a 0 in the index position of said element
        int n = temperatures.length;
        int[] answer = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(temperatures[j] > temperatures[i]){
                    answer[i] = j - i;
                    break;
                }
            }
            
        }
        return answer;
    }
}
