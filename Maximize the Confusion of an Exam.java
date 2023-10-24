class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {

        int countF = 0;
        int countT = 0;
        int ans = 0;
        int left =0;

        for(int i=0; i<answerKey.length(); i++)
        {
            if(answerKey.charAt(i) == 'F') countF++;
            else countT++;

            while(Math.min(countF,countT) > k)
            {
                 if(answerKey.charAt(left) == 'F') countF--;
                 else countT--;
                 left++;

            }
            ans = Math.max(ans , countF + countT);


        } 
        return ans;
        
    }
}