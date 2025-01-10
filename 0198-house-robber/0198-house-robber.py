class Solution(object):
    def rob(self, nums):
        dp = dict()
        def help(i):
            if i == 0:
                return nums[i]
            if i<0:
                return 0
            if i in dp:
                return dp[i]
            pick = nums[i]+ help(i-2)
            not_pick = help(i-1)
            dp[i] = max(pick,not_pick)
            return dp[i]
            
        help(len(nums)-1)
        return nums[0] if len(nums)-1 == 0 else dp[len(nums)-1]

        
        
        return 0