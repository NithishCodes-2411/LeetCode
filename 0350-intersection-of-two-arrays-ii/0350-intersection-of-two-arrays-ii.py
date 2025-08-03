class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        intersection = set(nums1) & set(nums2)
        freq1 , freq2 = dict() , dict()

        for num in nums1:
            if num not in freq1:
                freq1[num] = 0
            freq1[num]  = freq1[num] +1
        
        for num in nums2:
            if num not in freq2:
                freq2[num] = 0
            freq2[num]  = freq2[num] +1

        res = []
        for num in intersection :
            m = min(freq1[num] , freq2[num])

            arr = [num] * m 

            res = res + arr
        return res