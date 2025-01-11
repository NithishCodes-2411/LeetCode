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



        dp = [-1 for _ in range(col)] 
        n = 0
        for c in range(col):
            n = n + grid[0][c]
            dp[c] = n
            
        for r in range(1,row):
            new_dp = []
            for c in range(col):
                if c >= 1:
                    new_dp.append(grid[r][c] + min( dp[c] , new_dp[-1] ) )
                else:
                    new_dp.append( grid[r][c] + dp[c] )
            dp = new_dp
                    
        return dp[-1]



