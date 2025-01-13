class Solution(object):
    def coinChange(self, coins, amount):
        def f(s):
            if s < 0:
                return float("inf")
            if s == 0:
                return 0
            if s in dp:
                return dp[s]
                
            m = float("inf")
            for coin in coins:
                m = min(m, f(s - coin) + 1)
            dp[s] = m
            return m 
        
        dp = {}
        ans = f(amount)

        return ans if ans != float("inf") else -1
