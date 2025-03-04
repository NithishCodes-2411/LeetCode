class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        n = len(nums)

        for i in range(0,n-1):
            if nums[i] == nums[i+1]:
                nums[i] = nums[i] + nums[i+1]
                nums[i+1] = 0
        
        p = 0
        for i in range(0,n):
            if nums[i] != 0:
                nums[p] = nums[i]
                p = p+1
        for i in range(p,n):
            nums[i] = 0
        return nums

        