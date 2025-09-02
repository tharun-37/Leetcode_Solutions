class Solution {
    public int missingNumber(int[] nums) {
        Boolean a[] = new Boolean[nums.length + 1];
        Arrays.fill(a, false);
        for (int i = 0; i < nums.length; i++) {
            a[nums[i]] = true;
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i]) {
                return i;
            }
        }
        return -1;
    }
}
