class Solution {
    public double findMaxAverage(int[] nums, int k) {

        if(nums.length==1 && k==1) return nums[0];
       
        double avg = Integer.MIN_VALUE;
        double wSum = 0;
        
        for(int i=0; i<k; i++)
        {
            wSum += nums[i];
        }
        avg = Math.max(avg , wSum/k);
        for(int i=k; i<nums.length; i++)
        {            
           
            wSum = wSum + nums[i] - nums[i-k];
            avg = Math.max(avg , wSum/k);


        }
        return avg;

        
    }
}