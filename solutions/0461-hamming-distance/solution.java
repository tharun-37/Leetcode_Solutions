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
