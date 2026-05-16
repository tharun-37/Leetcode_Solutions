// Last updated: 5/16/2026, 10:17:58 PM
class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N == 0) return 1.0;
        if (N < 0) {
            x = 1.0 / x;
            N = -N;
        }
        double res = 1.0;
        while (N > 0) {
            if ((N & 1) == 1) res *= x;
            x *= x;
            N >>= 1;
        }
        return res;
    }
}