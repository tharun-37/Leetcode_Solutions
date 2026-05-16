// Last updated: 5/16/2026, 10:16:17 PM
class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int count = 0;
        for (int i : nums)
            if ((i & 1) == 0 && ++count == 2) return true;
        return false;
    }
}