class Solution(object):
    def minimumTotal(self, triangle):
        n = len(triangle)
        dp = dict()
        def f(i,row):
            if row == n-1:
                return triangle[row][i]
            if (i,row) not in dp:
                down = triangle[row][i] + f(i,row+1)
                right = triangle[row][i] + f(i+1,row+1)
                dp[(i,row)] =min(down,right)
            return dp[(i,row)]
        
        return f(0,0)

        
        