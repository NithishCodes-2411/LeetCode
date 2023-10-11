class Solution {
    public int[] rearrangeArray(int[] nums) {

        int ans [] = new int [nums.length];
        int x =0;
        int y=0; 
        int pos [] = new int [nums.length/2];
        int neg [] = new int [nums.length/2];
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                pos[x] = nums[i];
                x++;
            }
            if(nums[i]<0){
                neg[y] = nums[i];
                y++; 
            }
        }
        x=0;
        y=0;
        for(int i=0; i<nums.length;i=i+2){
            nums[i] = pos[x];
            x++;
        }
          for(int i=1; i<nums.length;i=i+2){
            nums[i] = neg[y];
            y++;
        }

        
        return nums;
      
    }
}