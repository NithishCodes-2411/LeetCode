class Solution:
    def minimumOperations(self, nums: List[int]) -> int:

        n = len(nums)

        dp = [ [0,] * 4 for _ in range(n) ]

        for prev in range(1,4):
            if nums[0] <= prev:
                dp[0][prev] = 1

        for i in range(1,n):
            for prev in range(1,4):
                pick = 0

                if nums[i]<=prev:
                    pick = 1+ dp[i-1][nums[i]]
                dp[i][prev] = max(pick , dp[i-1][prev] )
        return n - dp[n-1][3]

        
        # def f(i,prev):

        #     if i ==0 :
        #         return 1 if nums[0] <= prev else 0
            
        #     pick = 0

        #     if nums[i]<=prev:
        #         pick = 1+ f(i-1,nums[i])
        #     return max(pick , f(i-1,prev))
        
        # return n - f(n-1,3)



        