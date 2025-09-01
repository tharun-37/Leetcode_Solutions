class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> set = new HashSet<>();
        int n = nums.size();
        int operationCount = 0;
        for (int i = n - 1; i >= 0 && set.size() < k; i--) {
            int num = nums.get(i);
            if (num >= 1 && num <= k) {
                set.add(num);
            }
            operationCount++;
        }
        return operationCount;
    }
}
