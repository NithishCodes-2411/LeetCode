class Solution {
    public int differenceOfSum(int[] nums) {
     

        int eleSum = 0;
        int digSum =0;

        for(int i=0; i < nums.length; i++){
            eleSum += nums[i];
            while (nums[i] > 0) {
                digSum += nums[i] % 10;
                nums[i] /= 10;
            }
       
        }
        int ans = eleSum - digSum;
        return Math.abs(ans);
        
    }
}