class Solution(object):
    def uniquePaths(self, row, col):
        def f(r,c):
            if r==0 and c==0:
                return 1
            if r <0 or c<0 :
                return 0
            if (r,c) not in dp:
                dp[(r,c)] = f(r-1,c) + f(r,c-1)
            return dp[(r,c)]

        # dp = [1 for _ in range(col)]
        # for r in range(1,row):
        #     left = 0
        #     for c in range(col):
        #         dp[c] = left + dp[c]
        #         left = dp[c]
        # return dp[col-1]
        dp = dict()
        return f(row-1,col-1)

        


        