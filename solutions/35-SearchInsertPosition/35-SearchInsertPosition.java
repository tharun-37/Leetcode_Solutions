// Last updated: 5/16/2026, 10:18:06 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int c=0;
       for(int i=0;i<nums.length;i++){
        if(target>nums[i])c++;
        if(nums[i]==target){
            return i;
        }
       }return c; 
    }
}