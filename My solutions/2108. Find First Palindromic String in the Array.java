class Solution {
    public String firstPalindrome(String[] words) {

      for(int i=0; i<words.length; i++){
        String[] str = words[i].split("");
        boolean pldr = false;
        int r = 0;
        int l = str.length-1;
        if(str.length==1) return words[i];
        while(r<l && !pldr ){
          if(str[r].equals(str[l])){
            r++;
            l--;
          }
          else pldr = true;
         
        }
        if(!(r<l)) return words[i];

      }
      return "";
        
    }
}