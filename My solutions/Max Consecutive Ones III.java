class Solution {
    public int longestOnes(int[] nums, int k) {

        
        int zeroCount = 0;
        int left = 0;
        int right=0;
        while(right < nums.length)
        {
            if(nums[right]==0) zeroCount++;
            right++;

            if(zeroCount > k)
            {
                if(nums[left]==0) zeroCount--;
                left++;
            }
            

        }
        return right - left;

        
    }
}