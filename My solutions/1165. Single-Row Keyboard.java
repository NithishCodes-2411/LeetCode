class Solution {
    public int calculateTime(String keyboard, String word) {
      int ans = 0;
      ans += (Math.abs(0 - keyboard.indexOf(word.charAt(0) )));
      for (int i=1; i<word.length(); i++){
        ans += (Math.abs(keyboard.indexOf(word.charAt(i)) - keyboard.indexOf(word.charAt(i - 1))));
      }
      
      return ans;
        
    }
}