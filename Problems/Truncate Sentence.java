class Solution {
    public String truncateSentence(String s, int k) {
 
        String output = "";
        String [] ans = s.split(" ");
        for(int i=0; i<k; i++){
            output+=ans[i] + " ";
        }
        return output.trim();

        
    }
}