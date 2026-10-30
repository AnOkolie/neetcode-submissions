class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int[]dp = new int[n];
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int val = nums[i];
            int left = 0;
            if(map.containsKey(val-1)){
                left = dp[map.get(val-1)];
            }
            dp[i] = left+1;
            max = Math.max(dp[i],max);
            map.put(nums[i],i);
        }
        return max;
    }
}
