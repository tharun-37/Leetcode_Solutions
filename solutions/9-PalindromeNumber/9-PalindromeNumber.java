// Last updated: 5/16/2026, 10:18:34 PM
class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int n=x;
        if(x<0){
            return false;
        }
        while(n>0){
            sum=sum*10;
            sum+=n%10;
            n=n/10;
        }
        if(sum==x){
            return true;
        }
        else{
            return false;
        }
    }
}