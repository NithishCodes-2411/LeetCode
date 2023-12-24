class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            int prod = 1;
            for(int  j = i; j<nums.length; j++){
                prod = prod * nums[j];
                res = Math.max(prod , res);
            }
        }
        return res;
  
        
    }
}