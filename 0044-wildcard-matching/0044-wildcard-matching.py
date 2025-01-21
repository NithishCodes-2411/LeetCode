# class Solution:
#     def isAllStars(S1, i):
#         # Helper function to check if all characters up to index i in S1 are '*'
#         for j in range(i + 1):
#             if S1[j] != '*':
#                 return False
#         return True

#     def wildcardMatchingUtil(S1, S2, i, j, dp):
#         # Base conditions
#         if i < 0 and j < 0:
#             return True
#         if i < 0 and j >= 0:
#             return False
#         if j < 0 and i >= 0:
#             return isAllStars(S1, i)

#         # If the result for this subproblem is already computed, return it
#         if dp[i][j] != -1:
#             return dp[i][j]

#         if S1[i] == S2[j] or S1[i] == '?':
#             # Characters match or S1 has a '?'; move to the previous characters in both strings
#             dp[i][j] = wildcardMatchingUtil(S1, S2, i - 1, j - 1, dp)
#         elif S1[i] == '*':
#             # If S1 has a '*', there are two choices:
#             # 1. '*' represents an empty string in S1, so move to the previous character in S1 (i-1, j).
#             # 2. '*' represents one or more characters in S1, so move to the previous character in S2 (i, j-1).
#             dp[i][j] = wildcardMatchingUtil(S1, S2, i - 1, j, dp) or wildcardMatchingUtil(S1, S2, i, j - 1, dp)
#         else:
#             dp[i][j] = False  # Characters don't match, and S1[i] is not '*'

#         return dp[i][j]
#     def isMatch(self, S2: str, S1: str) -> bool:

        

#         # def f(i,j):
            
#         #     if j < 0 and i < 0 :
#         #         return True
#         #     if j < 0 and i >= 0:
#         #         return False

#         #     if  i < 0 and  j >=0 :
#         #         for jj in range(j+1):
#         #             if p[j] != "*":
#         #                  return False
#         #         return True 

#         #     if p[j] == s[i] or p[j] == "?":
#         #         return f(i-1,j-1)
#         #     elif p[j] == "*":
#         #         return f(i-1,j) or f(i,j-1)
#         #     else:
#         #         return False
        
#         # return f(n-1,m-1)

#         n = len(S1)
#         m = len(S2)

#         # Initialize a 2D DP array with -1 values
#         dp = [[-1 for _ in range(m)] for _ in range(n)]

#         # Calculate and return the result of wildcard matching
#         return wildcardMatchingUtil(S1, S2, n - 1, m - 1, dp)
class Solution:
    def isAllStars(self, S1, i):
        
        for j in range(i + 1):
            if S1[j] != '*':
                return False
        return True

    def wildcardMatchingUtil(self, S1, S2, i, j, dp):
       
        if i < 0 and j < 0:
            return True
        if i < 0 and j >= 0:
            return False
        if j < 0 and i >= 0:
            return self.isAllStars(S1, i)

        
        if dp[i][j] != -1:
            return dp[i][j]

        if S1[i] == S2[j] or S1[i] == '?':
            dp[i][j] = self.wildcardMatchingUtil(S1, S2, i - 1, j - 1, dp)
        elif S1[i] == '*':
            dp[i][j] = self.wildcardMatchingUtil(S1, S2, i - 1, j, dp) or self.wildcardMatchingUtil(S1, S2, i, j - 1, dp)
        else:
            dp[i][j] = False

        return dp[i][j]

    def isMatch(self, S2: str, S1: str) -> bool:
        n = len(S1)
        m = len(S2)

  
        dp = [[-1 for _ in range(m)] for _ in range(n)]

        
        return self.wildcardMatchingUtil(S1, S2, n - 1, m - 1, dp)
