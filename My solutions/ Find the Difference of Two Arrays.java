class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>(); 
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();   
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int n: nums1) s1.add(n);
        for(int n: nums2) s2.add(n);

        for(int n:nums1){
            if(s2.add(n)){
                list1.add(n);
            }
        }
        for(int n:nums2){
            if(s1.add(n)){
                list2.add(n);
            }
        }
        ans.add(list1);
        ans.add(list2);
        return ans;
        
    }
}