class Solution:
    def countGoodStrings(self, low: int, high: int, zero: int, one: int) -> int:
        MOD = 10**9 + 7
        # zero = "".join([str(0) for _ in range(zero)])
        # one = "".join([str(1) for _ in range(one)])
        
        dp = [1]+[-1] * high
        
        

        def f(end):
            if dp[end] != -1:
                return dp[end]
            c = 0
            if end >= zero:
                c+= f(end-zero)
            if end>=one:
                c+= f(end-one)
            dp[end] = c % MOD
            return dp[end]
                
            

        return sum( f(end) for end in range(low,high+1)) % MOD
        