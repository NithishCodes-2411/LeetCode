class Solution {
    public int maximizeSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        int largest = nums[nums.length-1];

        int sum = largest;
        for(int i=0; i<k-1; i++){
            int x = largest+1;
            sum += x;
            largest = x;

        }
        return sum;

        
    }
}