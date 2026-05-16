// Last updated: 5/16/2026, 10:18:00 PM
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;
        int jumps = 0;
        int curr = 0;
        int last = 0;
        for (int i = 0; i < n - 1; i++) {
            last = Math.max(last, i + nums[i]);
            if (i == curr) {
                jumps++;
                curr = last;
                if (curr >= n - 1) break;
            }
        }
        return jumps;
    }
}