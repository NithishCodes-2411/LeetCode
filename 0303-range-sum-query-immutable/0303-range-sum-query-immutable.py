class NumArray:
    """
    -2, 0, 3, -5, 2, -1
    -2,-2, 1,-4, -2 , -3  

    

    """
    
    def __init__(self, nums: List[int]):
        self.prefix = [ 0 for i in range(len(nums)+1)]
        
        for i in range(len(nums)):
            self.prefix[i+1] = self.prefix[i] + nums[i]

            
        

    def sumRange(self, left: int, right: int) -> int:
        return self.prefix[right+1] - self.prefix[left]



        


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)