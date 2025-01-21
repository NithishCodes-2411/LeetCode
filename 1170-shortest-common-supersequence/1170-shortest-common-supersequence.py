class Solution:
    def shortestCommonSupersequence(self, text1: str, text2: str) -> str:

        n , m = len(text1) , len(text2)
        dp=[ [0 for _ in range(m+1)] for _ in range(n+1) ]

        for i in range(1,n+1):
            for j in range(1,m+1):
                if text1[i-1] == text2[j-1]:
                    dp[i][j] = 1 + dp[i-1][j-1]
                else:
                    dp[i][j] = max(dp[i-1][j] ,dp[i][j-1])
        
        i,j = n,m
        s = ""
        while i > 0 and j > 0:
            if text1[i-1] == text2[j-1]:
                s += text1[i-1]
                i -= 1
                j -= 1
            elif dp[i-1][j] >= dp[i][j-1]:  
                s += text1[i-1]
                i -= 1
            else:  
                s += text2[j-1]
                j -= 1

        

        while i > 0:
            s+=text1[i-1]
            i=i-1
        while j>0:
            s+= text2[j-1]
            j=j-1
        return s[::-1]
            

        
        
            

        