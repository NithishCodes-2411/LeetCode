from typing import List

class Solution:
    def minimumMountainRemovals(self, nums: List[int]) -> int:
        n = len(nums)

        
        dp_left = [1] * n
        for i in range(n):
            for j in range(i):
                if nums[j] < nums[i]:
                    dp_left[i] = max(dp_left[i], dp_left[j] + 1)

        
        dp_right = [1] * n
        for i in range(n - 1, -1, -1):
            for j in range(i + 1, n):
                if nums[j] < nums[i]:
                    dp_right[i] = max(dp_right[i], dp_right[j] + 1)

        
        max_mountain = 0
        for i in range(n):
            if dp_left[i] > 1 and dp_right[i] > 1:  
                max_mountain = max(max_mountain, dp_left[i] + dp_right[i] - 1)

        return n - max_mountain
