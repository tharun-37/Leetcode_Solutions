class Solution {
    public int binaryGap(int n) {
        int temp=0,j=0,first=0,gap=0;
        while((n&1)==0){
            n>>=1;
            j++;
        }
        first=j;
        n>>=1;
        j++;
        while(n>0){
            if((n&1)==1){
                gap=j-first;
                if(gap>temp)temp=gap;
                first=j;
            }
            n>>=1;
            j++;
        }
        return temp;
    }
}
