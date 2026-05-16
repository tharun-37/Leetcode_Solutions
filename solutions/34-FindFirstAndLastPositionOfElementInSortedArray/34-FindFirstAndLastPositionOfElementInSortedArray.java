// Last updated: 5/16/2026, 10:18:07 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fi = -1;
        int li = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (fi == -1) {
                    fi = i;
                }
                li = i;
            }
        }
        
        return new int[]{fi, li};
    }
}