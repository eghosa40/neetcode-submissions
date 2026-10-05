class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] cars = new int[position.length][2];
        
        for(int i = 0; i < cars.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        int count = 0;
        double fleetTime = 0;

        for(int i = 0; i < cars.length; i++){
            double currentTime = (double) (target - cars[i][0]) / cars[i][1];
            if(currentTime > fleetTime){
                count++;
                fleetTime = currentTime;
            }
        }
        return count;
    }

}
