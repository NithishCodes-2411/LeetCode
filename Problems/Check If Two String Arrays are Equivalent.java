class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

     int word1L = word1.length;
     int word2L = word2.length;

     int n =  word2L;

     if(word1L>word2L){
         n = word1L;
     }
     String wordOne = "";
     String wordTwo = "";
     for(int i=0; i<n; i++){
         if(i<word1L){
             wordOne += word1[i];
         }
         if(i<word2L){
             wordTwo += word2[i];
         }
     }
     return wordOne.equals(wordTwo);
     
        

        
    }
}