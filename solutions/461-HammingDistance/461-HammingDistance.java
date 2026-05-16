// Last updated: 5/16/2026, 10:16:43 PM
class Solution {
    public int hammingDistance(int a, int b) {
        int j=0;
        while (a > 0 || b > 0) {
            if ((a & 1) != (b & 1)) {
                j++;
            }
            a >>= 1;
            b >>= 1;
        }
        return j;
    }
}