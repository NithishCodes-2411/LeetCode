class Solution:
    def countPaths(self, grid: List[List[int]]) -> int:
        row , col = len(grid), len(grid[0])
        MOD = 10**9 +7

        def dfs(r,c):
            m = 1
            if (r,c) in memo:
                return memo[(r,c)]
            memo[(r,c)] = 1
            for dr,dc in ((0,1),(1,0),(0,-1),(-1,0)):
                nr,nc = r+dr , c+dc
                if (0 <= nr< row and 0 <= nc < col) and (grid[nr][nc] > grid[r][c]):
                    memo[(r,c)] += dfs(nr,nc)
    
            return memo[(r,c)]

        ans = 0
        memo = dict()
        for i in range(row):
            for j in range(col):
                ans += dfs(i,j)
        return ans % MOD
        