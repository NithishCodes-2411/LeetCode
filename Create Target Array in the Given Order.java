class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int n = nums.length;
        int [] target = new int [n];
        ArrayList <Integer> list = new ArrayList <>();

        for( int i=0; i<n; i++){
            int ind = index[i];
            int num = nums[i];
            list.add(ind,num);
        }
        for(int i=0; i<n; i++){
           target[i] =  list.get(i);
        }
        return target;

       
    }
}