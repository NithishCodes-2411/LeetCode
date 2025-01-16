class Solution:
    def mincostTickets(self, days: List[int], costs: List[int]) -> int:
        one , seven , thirty = costs
        start ,end = days[0] , days[-1]
        i = 0
        dp = [-1 for _ in range(368)]

        for day in range(start,end+1):
            if day < days[i]:
                dp[day] = dp[day-1]
            else:
                i+=1
                dp[day] = min(one+dp[day-1] , seven+dp[day-7] , thirty+dp[day-30])
        return dp[end]+1






        




        # def f(curr):
        #     if curr < 0:
        #         return 0
        #     if curr not in traveldays:
        #         return f(curr-1)
        #     if dp[curr] != -1:
        #         return dp[curr]

        #     pass1 = one + f(curr-1)
        #     pass7 = seven + f(curr-7)
        #     pass30 = thirty + f(curr-30)
        #     dp[curr] = min(pass1,pass7,pass30)
        #     return dp[curr]
        
        # return f(days[-1])



            
        
        
        