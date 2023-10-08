class Solution {
    public int[] buildArray(int[] nums) {

        int [] ans = new int [nums.length];


        for(int i =0; i<nums.length; i++){
            int index = nums[nums[i]];
            ans[i]=index;
        }
        return ans;
        
    }
}