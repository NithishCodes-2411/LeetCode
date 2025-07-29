class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        n = len(nums)
       
        for i in range(n):

            new_index = abs(nums[i])-1

            if nums[new_index] >= 0:
                nums[new_index] *= -1
             
        ans = []
        for i in range(n):
            if nums[i] > 0 :
                ans.append(i+1)
        return ans

        