class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0;
        int j=0;
        int oddCount=0;
        int count=0;
        int temp=0;
        int index = 0;
        
        while(j<nums.length){

            //System.out.println("[" + i + "," + j + "] , " + "offC: "+oddCount);
            if(nums[j]%2==1){
                oddCount++;
                temp=0;
            }
           
            while(oddCount==k){
                //System.out.println("[" + i + "," + j + "] , " + "offC: "+oddCount);
                temp++;
                if(nums[i]%2==1){
                    oddCount--;
                }
                i++;

            }
            count+=temp;
            j++;
            //System.out.println("count: " + count);
        }
        return count;
    }
}