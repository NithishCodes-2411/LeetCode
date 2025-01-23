class Solution:
    def maxProfit(self, k: int, prices: List[int]) -> int:
        n = len(prices)
        def f(ind , buy , cap):
            
            if cap==0 or ind==n:
                return 0

            if (ind,buy,cap) not in dp:
                if buy:
                    dp[(ind,buy,cap)] =  max(f(ind+1, buy,cap) , -prices[ind]+f(ind+1,False,cap))
                else:
                    dp[(ind,buy,cap)] =  max(prices[ind] + f(ind+1,True,cap-1) , f(ind +1, buy , cap))

            return dp[(ind,buy,cap)]
        

        dp = dict()
        return f(0,True,k)
        