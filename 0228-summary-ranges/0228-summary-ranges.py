class Solution:
    # [0,1,2,4,5,7] r = 2 , i = 3
    def summaryRanges(self, nums: List[int]) -> List[str]:
        
        if nums is None :
            return list()
        n = len(nums)
        if n == 0:
            return list()
        r = 0 
        ans =[]
        for i in range(1,n):
            if nums[i] == nums[i-1]+1:
                r = r+1
                continue
            else:
                if r > 0:
                    ans.append(str(nums[i-r-1]) + "->" + str(nums[i-1]))
                else:
                    ans.append(str(nums[i-1]))
                r = 0
        
        if r  == 0:
            ans.append(str(nums[n-1]))
        else:
            ans.append(str(nums[n-r-1]) + "->" + str(nums[n-1]))
        
        return ans



            



        

        