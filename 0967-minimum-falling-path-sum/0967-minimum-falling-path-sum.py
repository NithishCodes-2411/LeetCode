class Solution(object):
    def minFallingPathSum(self, matrix):
        row , col = len(matrix) , len(matrix[0])

        def f(r,c):
            if  c < 0 or c >= col:
                return float("inf")
            if r == row-1:
                return matrix[r][c]
            if (r,c) in dp:
                return dp[(r,c)]
            dp[(r,c)] =  matrix[r][c] + min(f(r+1,c+1) ,f(r+1,c-1) ,f(r+1,c))
            return dp[(r,c)]
            
        ans = float("inf")
        for j in range(col):
            dp = dict()
            ans = min(ans,f(0,j))
        return ans 

        