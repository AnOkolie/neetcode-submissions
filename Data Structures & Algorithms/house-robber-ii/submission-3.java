class Solution {
    private int[]dp;
    private boolean[] track;
    private int max;
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        return Math.max(dfs(nums,0,n-2),dfs(nums,1,n-1));
    }

    public int dfs(int[]nums, int start, int end){
        int[]dp = new int[nums.length];
        if(start > end){
            return 0;
        }
        for(int i=end; i>= start; i--){
            int l = i+1 <= end ? dp[i+1] : 0;
            int r = i+2 <= end ? dp[i+2] : 0;
            dp[i] = Math.max(l,nums[i]+r);
        }
        return dp[start];
    }
}
