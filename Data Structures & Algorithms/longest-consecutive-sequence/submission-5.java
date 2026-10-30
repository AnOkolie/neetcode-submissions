class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int n = nums.length;
        int max = 0;
        int count = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                count = 1;
                int curr = num;
                while (curr != Integer.MAX_VALUE && set.contains(curr + 1)) {
                    count++;
                    curr = curr + 1;
                }
                max = Math.max(count, max);
                count = 0;
            }
        }
        return max;
    }
}
