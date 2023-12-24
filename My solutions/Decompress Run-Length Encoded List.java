class Solution {
    public int[] decompressRLElist(int[] nums) {

        int n = nums.length;
        int i=0;
        String output = "";
        while(i<n){
            for(int j=0; j<nums[i]; j++){
                output += nums[i+1] + " ";
            }
            i = i+2;
        }
        String [] outputstr = output.split(" ");
        int x = outputstr.length;
        int [] ans = new  int [x];

        for(int j=0; j<x; j++){
            ans[j] = Integer.parseInt(outputstr[j]);

        }
        return ans;
       
    }
}