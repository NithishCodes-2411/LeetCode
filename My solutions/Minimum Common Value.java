class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        HashSet <Integer> set = new HashSet <Integer>();
        for(int num : nums1) set.add(num);
        int ans = Integer.MAX_VALUE;
        boolean common = false;
        for(int num : nums2){
            if(set.contains(num)) {
                ans = Math.min(ans , num);
                common = true;
                }
        }
        if(!common) return -1;
        return ans;
        
    }
}