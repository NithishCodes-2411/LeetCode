class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:

        n , m = len(text1) , len(text2)
        dp=[ [0 for _ in range(m+1)] for _ in range(n+1) ]

        for i in range(1,n+1):
            for j in range(1,m+1):
                if text1[i-1] == text2[j-1]:
                    dp[i][j] = 1 + dp[i-1][j-1]
                else:
                    dp[i][j] = max(dp[i-1][j] ,dp[i][j-1])
        return dp[n][m]


         


        # def f(i1,i2):
        #     if i1<0 or i2<0:
        #         return 0
        #     if (i1,i2) in dp:
        #         return dp[(i1,i2)] 

        #     if (text1[i1] == text2[i2]):
        #         return 1+ f(i1-1,i2-1)
            
        #     dp[(i1,i2)]= max( f(i1,i2-1) , f(i1-1,i2) )
        #     return dp[(i1,i2)]
        
        # return f(len(text1) -1, len(text2)-1)
            



        