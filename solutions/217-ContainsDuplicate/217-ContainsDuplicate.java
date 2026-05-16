// Last updated: 5/16/2026, 10:17:06 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i))return true;
            set.add(i);
        }
        return false;
    }
}