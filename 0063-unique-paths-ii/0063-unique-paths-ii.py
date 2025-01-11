class Solution(object):
    def uniquePathsWithObstacles(self, obstacleGrid):
        obs = set()
        row , col = len(obstacleGrid) , len(obstacleGrid[0])
        for r in range(row):
            for c in range(col):
                if obstacleGrid[r][c] == 1:
                    obs.add((r,c))


        def f(r,c):

            if r <0 or c<0 or (r,c) in obs:
                return 0
            if r==0 and c==0:
                return 1
            if (r,c) not in dp:
                dp[(r,c)] = f(r-1,c) + f(r,c-1)
            return dp[(r,c)]

        dp = dict()
        return f(row-1,col-1)


