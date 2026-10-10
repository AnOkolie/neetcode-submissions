class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int num:nums){
            total += num;
        }
        if(total % 2 == 1){
            return false;
        }
        int target = total/2;
        boolean dp[] = new boolean[target+1];
        dp[0] = true;
        for(int num:nums){
            for(int s = target; s>=num; s--){
                dp[s] = dp[s] || dp[s-num];
            }
            if(dp[target]){
                return true;
            }
        }
        return false;
    }
}
