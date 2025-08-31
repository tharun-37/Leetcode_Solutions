class Solution {
    public int distanceTraveled(int m, int a) {
        int dis=0;
        while(m>=5){
            m-=5;
            dis+=50;
            if(a!=0){
                m++;
                a--;
            }
        }
        return dis+ m*10;
    }
}
