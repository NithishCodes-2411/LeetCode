class Solution {
    public int sumOfSquares(int[] nums) {
        int answer =0;
        int n=nums.length;
        for(int i=0; i<nums.length; i++){
            int index = i+1;
            if((n%index)==0){
                int sqrt = nums[i]*nums[i];
                answer += sqrt;
            }

        }
        return answer;
        
    }
}