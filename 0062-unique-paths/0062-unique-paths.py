class Solution(object):
    def uniquePaths(self, row, col):
        
        dp = [1 for _ in range(col)]
        for r in range(1,row):
            left = 0
            for c in range(col):
                dp[c] = left + dp[c]
                left = dp[c]
        return dp[col-1]


        


        