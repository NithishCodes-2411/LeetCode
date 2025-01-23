class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        m = prices[-1]
        n = len(prices)

        if n == 1:
            return  0
        
        ans = 0
        for i in range(n-2,-1,-1):

            ans = max(ans,m - prices[i])
            m = max(m,prices[i])
        
        return ans 