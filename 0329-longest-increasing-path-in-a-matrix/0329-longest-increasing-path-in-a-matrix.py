class Solution:
    def longestIncreasingPath(self, matrix: List[List[int]]) -> int:
        row , col = len(matrix) ,len(matrix[0])
        def dfs(r,c):
            m = 1
            if (r,c) in memo:
                return memo[(r,c)]
            for dr,dc in ((0,1),(1,0),(0,-1),(-1,0)):
                nr,nc = r+dr , c+dc

                if (0 <= nr< row and 0 <= nc < col) and (matrix[nr][nc] > matrix[r][c]):
                    m = max(m,1+dfs(nr,nc))
            memo[(r,c)] = m
            return m
        ans = 0
        memo = dict()
        for i in range(row):
            for j in range(col):
                
                ans = max(ans,dfs(i,j))
        return ans


            


        