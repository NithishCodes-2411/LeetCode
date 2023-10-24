class Solution {
    public int countCompleteSubarrays(int[] nums) {

        HashSet <Integer> diffNum = new HashSet<>();
        for (Integer num : nums)  diffNum.add(num) ;
        int n = diffNum.size();

        
        int left = 0;
        int count = 0;

        for(int right = 0; right < nums.length; right++){
            HashSet <Integer> set = new HashSet<>();
            for( int j=right; j<nums.length; j++ )
            {
                set.add(nums[j]);
                if(set.size()==n)
                {
                    count += nums.length - j;
                    break;
                }

            }

            

        }
        return count;





    }

}