class Solution:
    def maxProfit(self, prices: List[int], fee: int) -> int:
        n = len(prices)
        dp = [ [-1]*2 for _ in range(n+1) ]
        dp[n][0] = dp[n][1] = 0

        for ind in range(n-1,-1,-1):
            for buy in range(2):
                profit = float("-inf")
                if buy == 0:
                    profit = max(0 + dp[ind + 1][0], -prices[ind] + dp[ind + 1][1])
                elif buy == 1:
                    profit = max(0 + dp[ind + 1][1],  prices[ind] + dp[ind + 1][0] - fee)
                dp[ind][buy] = profit
        return dp[0][0]


        # def f(i,buy):

        #     if i == n:
        #         return 0

        #     if buy:
        #         return max( -fee+ -prices[i] + f(i+1, False) , f(i+1,buy))
        #     else:
        #         return max(  prices[i] + f(i+1,True) , f(i+1,buy))
        
        # return f(0,True)
            
        