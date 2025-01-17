class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        nums.sort()
        n = len(nums)
        
        
        l , r = 0 , n-1

        c = 0
        while l<r:
            s = nums[l] + nums[r]

            if s == k:
                l = l+1
                r = r- 1
                c = c+1
            
            if s < k :
                l += 1
            elif s > k:
                r = r-1
        return c
        