class Solution(object):
    def rob(self, arr):
        """
        :type nums: List[int]
        :rtype: int
        """
        def help(nums):
            n = len(nums)
            dp = [-1] * n 

            prev2 = 0
            prev = nums[0]

            for i in range(1,n):
                pick = nums[i] + prev2
                not_pick = prev
                curr = max(pick,not_pick)
                prev2 = prev
                prev = curr
            return prev

        n = len(arr)
        if n ==1:
            return arr[0]
        if n == 2:
            return max(arr)
        
        return max(help(arr[:n-1]) , help(arr[1:]) )   