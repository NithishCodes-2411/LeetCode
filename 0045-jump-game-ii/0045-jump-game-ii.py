class Solution:
    def jump(self, nums: List[int]) -> int:
        


        n = len(nums)
        dp = [float('inf')] * n
        dp[0] = 0  
        
        
        for i in range(1, min(nums[0] + 1, n)):
            dp[i] = 1
        
        
        for i in range(1, n):
            end = min(n, i + nums[i])
    
            for jump in range(i + 1, end+1):
                if jump >= n :
                    continue
                dp[jump] = min(dp[jump], 1 + dp[i])
        
        
        return dp[-1]







        # memo solution 
        # dp = dict()

        # def f(i):
        #     if i >=  n-1:
        #         return 0
        #     if i in dp:
        #         return dp[i]
        #     end = min(n,i+nums[i])

        #     m = float("inf")
        #     for jump in range(i+1 , end +1):
        #         m = min(m,1+ f(jump))
        #     dp[i] = m
        #     return m
        # return f(0)
                
        