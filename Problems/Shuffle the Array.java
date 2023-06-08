class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans = new int [n*2];
        
        
        for(int i=0; i< n; i++){
            ans[i*2] = nums[i];
        }
        int k=1;
        for(int i=n; i < nums.length; i++){
            ans[k]=nums[i];
            k = k+2;
        }
        return ans;
     
    }
}