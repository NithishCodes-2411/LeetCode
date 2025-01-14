class Solution(object):
    def canPartition(self, nums):
        ts = sum(nums)
        n = len(nums)
        if ts%2==1:
            return False
        memo = {}
        def f(s,p):
            if p == -1:
                return False
            
            if s == ts-s:
                return True
            if (s,p)  in memo:
                return memo[(s,p)]

            not_pick = f(s,p-1)
            pick = f(s+nums[p] , p-1)

            memo[(s,p)] = not_pick or pick 
            return memo[(s,p)]


        return f(0,n-1)
        