class Solution:
    def jump(self, nums: List[int]) -> int:
        n = len(nums)
        dp = dict()

        def f(i):
            if i >=  n-1:
                return 0
            if i in dp:
                return dp[i]
            end = min(n,i+nums[i])
            
            m = float("inf")
            for jump in range(i+1 , end +1):
                m = min(m,1+ f(jump))
            dp[i] = m
            return m
        return f(0)
                
        