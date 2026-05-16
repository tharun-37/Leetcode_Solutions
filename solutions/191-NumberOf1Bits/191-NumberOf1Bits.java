// Last updated: 5/16/2026, 10:17:15 PM
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n>0){
            count+=n%2;
            n>>=1;         
        }
        return count;
    }
}