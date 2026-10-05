class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int inc[] = new int[n];
        inc[0] = nums[0];
        inc[1] = Math.max(nums[1],inc[0]);
        for(int i=2; i<n; i++){
            inc[i] = Math.max(nums[i]+inc[i-2],inc[i-1]);
        }
        return inc[n-1];
    }
}
