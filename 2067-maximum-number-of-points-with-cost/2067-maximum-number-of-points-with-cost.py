from typing import List

class Solution:
    def maxPoints(self, points: List[List[int]]) -> int:
        n, m = len(points), len(points[0])
        dp = points[0]

        for i in range(1, n):
            left = [0] * m
            right = [0] * m
            new_dp = [0] * m
            
            
            left[0] = dp[0]
            for j in range(1, m):
                left[j] = max(left[j - 1] - 1, dp[j])

            
            right[m - 1] = dp[m - 1]
            for j in range(m - 2, -1, -1):
                right[j] = max(right[j + 1] - 1, dp[j])

            
            for j in range(m):
                new_dp[j] = points[i][j] + max(left[j], right[j])

            dp = new_dp
        
        return max(dp)
