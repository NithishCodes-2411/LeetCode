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

        int l =0;
        int h = n;
        int mid = l + (h - l) / 2;
        if (n==1) return 1;
        while (l<=h)
        {
            mid =l + (h - l) / 2;
            if(guess(mid)==0) {return mid;}
            else if (guess(mid)==-1) { h = mid - 1;} 
            else {l = mid+1;}
        }
        return -1;
        
        
    }
}