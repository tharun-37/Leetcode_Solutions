import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Boolean arr[]=new Boolean[1000];
        Arrays.fill(arr,false);
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0)continue;
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    int a=digits[i];
                    int b=digits[j];
                    int c=digits[k];
                    int num=(a*100)+(b*10)+c;
                    if(k==i||i==j||j==k)continue;
                    if(num%2==0){
                        arr[num]=true;
                    }
                }
            }
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=100;i<1000;i++){
            if(arr[i]){
                a.add(i);
            }
        }
        int result[]=new int[a.size()];
        for(int i=0;i<a.size();i++){
            result[i]=a.get(i);
        }
        return result;
    }
}
