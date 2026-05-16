// Last updated: 5/16/2026, 10:16:56 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }
        for (int i = insertPos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}