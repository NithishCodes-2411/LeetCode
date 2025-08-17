class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:

        duplicates = []

        for value in nums:
            idx = abs(value) -1

            if nums[idx] < 0:
                duplicates.append(abs(value))
            else:
                nums[idx] *= -1
        return duplicates




        

        
        