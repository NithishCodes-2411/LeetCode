class Solution:
    def findLengthOfLCIS(self, nums: List[int]) -> int:
        ans = 1

        if len(nums) ==1 :
            return 1
        count = 1
        for i in range(1,len(nums)):
            if nums[i] > nums[i-1]:
                count = count +1
            else:
                count =1 
            ans = max(count , ans)
        return ans 
        