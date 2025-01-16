class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        n = len(nums)
        s = set()
        if n ==1:
            return 0
        
        
        for i in range(n-1,-1,-1):
            s.add(nums[i])

            if len(s) < n-i:
                i = i+1
                return i//3 + 1 if i%3 > 0 else i//3
        return 0

                
                


        