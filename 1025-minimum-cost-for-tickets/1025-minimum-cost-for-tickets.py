class Solution:
    def mincostTickets(self, days: List[int], costs: List[int]) -> int:
        one , seven , thirty = costs
        start ,end = days[-1] , days[0]
        traveldays = set(days)
        dp = [-1 for _ in range(start+1)]


        def f(curr):
            if curr < 0:
                return 0
            if curr not in traveldays:
                return f(curr-1)
            if dp[curr] != -1:
                return dp[curr]

            pass1 = one + f(curr-1)
            pass7 = seven + f(curr-7)
            pass30 = thirty + f(curr-30)
            dp[curr] = min(pass1,pass7,pass30)
            return dp[curr]
        
        return f(days[-1])



            
        
        
        