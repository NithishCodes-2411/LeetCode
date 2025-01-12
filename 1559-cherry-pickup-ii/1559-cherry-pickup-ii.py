class Solution(object):
    def cherryPickup(self, grid):
        row , col = len(grid) , len(grid[0])
        dp = dict()
        def f(i ,j1,j2):
            if not (0<=j1<col and 0<=j2<col):
                return -1e8
            
    
            curr = grid[i][j1] if j1==j2 else grid[i][j1]+grid[i][j2]
            if i==row-1:
                return curr
            if (i,j1,j2) in dp:
                return dp[(i,j1,j2)]

            m = float("-inf")
            for d1 in range(-1,2):
                for d2 in range(-1,2):
                    m = max(m,f(i+1,j1+d1,j2+d2))
            dp[(i,j1,j2)] = m+curr
            return dp[(i,j1,j2)]
        
        return f(0,0,col-1)


            






        
        