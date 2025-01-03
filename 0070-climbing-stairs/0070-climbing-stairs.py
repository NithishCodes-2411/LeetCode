class Solution(object):
    def sol(self,n):
        if n <= 1:
            return 1
        if n == 2 or n ==3:
            return n

        if n in self.dp :
            return self.dp[n]

        jump1 = self.sol(n-1)
        jump2 = self.sol(n-2)
        
        self.dp[n] = jump1 + jump2
        return self.dp[n]

    def climbStairs(self, n):
        self.dp = dict()
        return self.sol(n)



        