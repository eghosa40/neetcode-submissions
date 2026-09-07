class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int output = 0;
        int[][] cars = new int[position.length][2];
        
        for(int i = 0; i < position.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        Deque<Double> stack = new ArrayDeque<>();

        for(int i = 0; i < position.length; i++){
            double currenTime = (double)(target - cars[i][0]) / cars[i][1];
            
            if(stack.isEmpty() || currenTime > stack.peek()){
                stack.push(currenTime);
            }
        }
        return stack.size();
    }
}
