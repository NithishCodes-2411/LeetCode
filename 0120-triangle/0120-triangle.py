class Solution(object):
    def minimumTotal(self, triangle):
        n = len(triangle)
        m = len(triangle[n-1])
        
        dp = [ [float("inf") for _ in range(m)] for _ in range(n)]
        dp[0][0] = triangle[0][0]

        for i in range(1,n):
            # print(dp)
            for j in range(i+1):
                dp[i][j] = triangle[i][j]
                m = dp[i-1][j]
                if j > 0:
                    m = min(m , dp[i-1][j-1])
                dp[i][j] = dp[i][j] + m

        # print(dp)
        return min(dp[n-1]) 


        # dp = dict()
        # def f(i,row):
        #     if row == n-1:
        #         return triangle[row][i]
        #     if (i,row) not in dp:
        #         down = triangle[row][i] + f(i,row+1)
        #         right = triangle[row][i] + f(i+1,row+1)
        #         dp[(i,row)] =min(down,right)
        #     return dp[(i,row)]
        
        # return f(0,0)


        
        