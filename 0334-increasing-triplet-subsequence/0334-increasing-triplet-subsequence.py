class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        
        n = len(nums)
        if n < 3:
            return False
        
        right = [-1] * n 
        l = nums[-1]
        for i in range(n-1,-1,-1):
            right[i] = l
            l=max(l,nums[i])
        
        left = [-1] * n 
        s = nums[0]

        for i in range(n):
            left[i]=s
            s=min(s,nums[i])
        
        ans = False
        for i in range(1,n-1):
            ans = ans or  left[i] < nums[i] < right[i]
        return ans 
        
        

            
        
        
            
            

        