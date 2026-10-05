class Solution {
    public int maxArea(int[] heights) {
        int right = heights.length - 1;
        int left = 0;
        int ans = 0;

        while(left < right){
            int area = Math.min(heights[right], heights[left]) * (right - left);
            ans = Math.max(ans, area);
            if(heights[left] <= heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}
