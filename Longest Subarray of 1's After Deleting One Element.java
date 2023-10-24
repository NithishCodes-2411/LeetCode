class Solution {
    public int longestSubarray(int[] nums) {

       
        
       boolean ZeroFound = false;
        for(int num : nums) {
            if(num==0) {
                ZeroFound = true;
            }
        }
        if(!ZeroFound) return nums.length-1;


        int ans = 0;
        int zeroCount = 0;

        int left = 0;
        for(int right=0; right<nums.length; right++)
        {
            if(nums[right] == 0) {
                zeroCount++;
                continue;
            }
            System.out.println("ZEro count: "+zeroCount);

            while(zeroCount >1  )
            {

                //int len = right - left ; //dont add plus 1 bcoz we are deleteing an element
               // System.out.println("right: " + right + " left: " + left + " len: " + len);
        

                if(nums[left]==0) zeroCount--;
                left++;
            }
            ans = Math.max(ans , right - left + 1 - zeroCount);
            //System.out.println("ans: " + ans);

         
            
        }
        return ans;

    }
}