class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {

        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            // System.out.print(nums[i]+" ");
        }
        int ans [] = new int [queries.length];
        for(int i=0; i<queries.length; i++)
        {
            int count = 0;
            int sum = 0;
            for(int j=0; j<nums.length; j++)
            {
                sum += nums[j];
                //System.out.print(sum + " ");
                if(sum<=queries[i])
                {
                    count++;
                }
                else{
                    j = nums.length;
                }

            }
            ans [ i] = count;
        }
        return ans;
        
    }
}