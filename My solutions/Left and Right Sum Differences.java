class Solution {
    public int[] leftRightDifference(int[] nums) {

       /* int n = nums.length;

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        

        for(int i=1; i < n ; i++){
            leftSum[i]= leftSum[i-1]+nums[i-1]; 
        }

   
        for(int i = n; i >=0 ; i--){
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

     }
        int [] answer = new int [n];
        for(int i=0;  i<n ; i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }


        return answer;
        */

                int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
      

    
        
    }
}