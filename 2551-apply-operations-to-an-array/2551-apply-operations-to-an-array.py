class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        n = len(nums)

        for i in range(0,n-1):
            if nums[i] == nums[i+1]:
                nums[i] = nums[i] + nums[i+1]
                nums[i+1] = 0
        ans = [0] * n 
        i = 0
        for num in nums:
            if num != 0:
                ans[i] = num
                i = i+1
        return ans
        