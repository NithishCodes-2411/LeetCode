class Solution:
    """
    # nums[i] are not negavtive.
    # length 0 -> 1000
    # 
    Edge cases:
        =>  
    """
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
         return list(set(nums1) & set(nums2))
        