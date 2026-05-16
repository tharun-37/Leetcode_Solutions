// Last updated: 5/16/2026, 10:32:25 PM
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return guesser(1,n);
    }
    public int guesser(int n,int m){
        int mid =n+((m-n)/2);
        if (guess(mid)==0){
            return mid;
        }
        else if(guess(mid)==-1){
            return guesser(1,mid-1);
        }
        else if(guess(mid)==1){
            return guesser(mid+1,m);
        }
        return -1;
    }
}