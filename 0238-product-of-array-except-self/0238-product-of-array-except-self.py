class Solution:
    """

    """
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        prefix , suffix = [1 for _ in range(n) ] , [1 for _ in range(n) ]

        for i in range(1,n):
            prefix[i] = prefix[i-1] * nums[i-1]
        for i in range(n-2,-1,-1):
            suffix[i] = suffix[i+1] * nums[i+1]
        return [ prefix[i]* suffix[i]  for i in range(n) ]


            

            