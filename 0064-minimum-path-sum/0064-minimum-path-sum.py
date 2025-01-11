class Solution(object):
    def minPathSum(self, grid):
        row, col = len(grid), len(grid[0])
        # dp = dict()
        # def f(r, c):
        #     if r == 0 and c == 0:
        #         return grid[0][0]
        #     if r < 0 or c < 0:
        #         return float('inf')
            
        #     if (r,c) not in dp:
        #         dp[(r,c)] = grid[r][c] + min(f(r - 1, c), f(r, c - 1))
        #     return dp[(r,c)]

        
        # return f(row - 1, col - 1)



        dp =[ [-1 for _ in range(col)] for _ in range(row) ]
        n = 0
        for c in range(col):
            n = n + grid[0][c]
            dp[0][c] = n
            
        for r in range(1,row):
            for c in range(col):
                if c >= 1:
                    dp[r][c] = grid[r][c] + min( dp[r][c-1] , dp[r-1][c] ) 
                else:
                    dp[r][c] = grid[r][c] + dp[r-1][c]
                    
                # print(dp)
        return dp[row-1][col-1]



