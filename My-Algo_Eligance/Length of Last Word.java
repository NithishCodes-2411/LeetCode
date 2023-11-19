class Solution {
    public int lengthOfLastWord(String s) {


        String [] ans = s.trim().replaceAll(" +", " ").split(" ");
        
        return ans[ans.length-1].length();


        
    }
}