class Solution {
    public String mergeAlternately(String word1, String word2) {

      if(word1==null) return word2;
      if(word2 == null) return word1;

       int n = Math.max(word1.length() , word2.length());
       
       String ans = "";
       for(int i=0; i<n; i++){
            if(i<word1.length())ans+= word1.charAt(i);
            if(i<word2.length())ans+= word2.charAt(i);
       }
       return ans;
        
    }
}