// Last updated: 5/16/2026, 10:16:50 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int ans = 10;
        int unique = 9;
        int available = 9;
        for (int i = 2; i <= n && i <= 10; i++) {
            unique *= available;
            ans += unique;
            available--;
        }
        return ans;
    }
}