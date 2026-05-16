// Last updated: 5/16/2026, 10:17:04 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}