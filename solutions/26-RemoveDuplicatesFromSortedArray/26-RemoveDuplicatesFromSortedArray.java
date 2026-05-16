// Last updated: 5/16/2026, 10:18:15 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int c = 1; 
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i+1]) { 
                nums[c] = nums[i+1]; 
                c += 1; 
            }
        }
        return c; 
    }
}