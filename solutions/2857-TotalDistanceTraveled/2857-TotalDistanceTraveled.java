// Last updated: 5/16/2026, 10:16:16 PM
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