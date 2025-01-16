from typing import List

class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        n = len(nums)

        dp = [1] * n
        for i in range(n):
            m = 0
            for j in range(i):
                if nums[j] < nums[i]:
                    m = max(m,dp[j])
            dp[i] += m
        return max(dp)
        


