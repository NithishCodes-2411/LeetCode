class Solution(object):
    def minFallingPathSum(self, matrix):

        row , col = len(matrix) , len(matrix[0])

        dp = matrix[0]

        for r in range(1,row):
            new_dp = []
            for c in range(col):
                v = matrix[r][c]
                m = dp[c]
                if c > 0:
                    m = min(m,dp[c-1])
                if c < col-1:
                    m = min(m,dp[c+1])
                
                new_dp.append(v+m)
            dp = new_dp
        
        return min(dp)



        # dp = [ [float("inf") for _ in range(col)] for _ in range(row)]

        # for c in range(col):
        #     dp[0][c] = matrix[0][c]
        
        # for r in range(1,row):
        #     for c in range(col):
        #         dp[r][c] = matrix[r][c]
        #         m = dp[r-1][c]
        #         if c > 0:
        #             m = min(m,dp[r-1][c-1])
        #         if c < col-1:
        #             m = min(m,dp[r-1][c+1])
                
        #         dp[r][c] += m
        
        # return min(dp[row-1])


        # def f(r,c):
        #     if  c < 0 or c >= col:
        #         return float("inf")
        #     if r == row-1:
        #         return matrix[r][c]
        #     if (r,c) in dp:
        #         return dp[(r,c)]
        #     dp[(r,c)] =  matrix[r][c] + min(f(r+1,c+1) ,f(r+1,c-1) ,f(r+1,c))
        #     return dp[(r,c)]

        # ans = float("inf")
        # for j in range(col):
        #     dp = dict()
        #     ans = min(ans,f(0,j))
        # return ans 
        

        