// Last updated: 5/16/2026, 10:17:11 PM
class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        notPrime[j] = true;
                    }
                }
            }
        }
        
        return count;
    }
}