class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int n = heights.length;
        int minHeight = Math.min(heights[0],heights[1]);
        int l = 0; 
        int r = n-1;
        while(l < r){
            int currVal = Math.min(heights[l],heights[r])*(r-l);
            maxWater = Math.max(currVal,maxWater);
            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxWater;
    }
}
