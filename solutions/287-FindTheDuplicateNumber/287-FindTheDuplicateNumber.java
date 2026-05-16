// Last updated: 5/16/2026, 10:16:55 PM
class Solution {
    public int findDuplicate(int[] nums) {
        int first = nums[0];
        int second = nums[0];
        do {
            first = nums[first];
            second = nums[nums[second]];
        } while (first != second);
        first = nums[0];
        while (first != second) {
            first = nums[first];
            second = nums[second];
        }
        return second;
    }
}