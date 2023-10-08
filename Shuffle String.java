class Solution {
    public String restoreString(String s, int[] indices) {

        int n = indices.length;
        String [] S = s.split("");
        String [] ans = new String [n];
        
        for(int i=0; i<n; i++){
            int index = indices[i];
            ans[index] = S[i];
        }
        String output ="";
        for(int i=0; i<n; i++){
            output += ans[i];
        }
        return output;
        
    }
}