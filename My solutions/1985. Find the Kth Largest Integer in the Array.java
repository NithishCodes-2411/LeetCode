class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (String o1, String o2) -> {
            if (o1.length() == o2.length()) {
                return o2.compareTo(o1);
            }
            return o2.length() - o1.length();
        });
        return nums[k - 1];
    }
}