class Solution {
    public int reverse(int x) {
        int n=x,ans=0,c=0;
        if(n<0){
            n=-n;
            c=1;
        }
        while(n>0){
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && n%10 > 7)) return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && n%10 < -8)) return 0;
            ans=ans*10+n%10;
            n=n/10;
        }
        return (c==0)?ans:-ans;
    }
}
