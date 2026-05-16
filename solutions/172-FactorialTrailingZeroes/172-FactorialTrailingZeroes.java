// Last updated: 5/16/2026, 10:17:19 PM
class Solution {
    public int trailingZeroes(int n) {
        if (n < 5) return 0;
        int c = 0;
        while (n > 0) {
            n /= 5;
            c += n;
        }
        return c;
    }
}
