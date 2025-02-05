# class Solution:
#     def searchRange(self, nums: List[int], target: int) -> List[int]:
#         if not nums:
#             return [-1,-1]
#         n = len(nums)
#         lb , ub = n-1 , n-1
#         low , high = 0 , n-1

#         while low<=high:

#             mid = low + (high-low)//2

#             if nums[mid] >= target:
#                 lb = mid
#                 high =  mid-1
#             else:
#                 low = mid+1
        
#         low , high = 0 , n-1
#         while low <= high:

#             mid = low + (high-low)//2

#             if nums[mid] > target:
#                 ub = mid 
#                 high = mid-1
#             else:
#                 low = mid +1
        
#         ans = []
       
#         if nums[lb] == target:
#             ans.append(lb)
#         else:
#             ans.append(-1)
        
#         if nums[ub] == target:
#             ans.append(up)
#         else:
#             ans.append(-1)

#         return ans

from typing import List

class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        if not nums:
            return [-1, -1]

        n = len(nums)
        
        # Lower Bound: First occurrence of target
        low, high = 0, n - 1
        lb = -1
        while low <= high:
            mid = low + (high - low) // 2
            if nums[mid] >= target:  # Move left
                high = mid - 1
            else:
                low = mid + 1
            if nums[mid] == target:
                lb = mid  # Store the leftmost index
        
        # Upper Bound: Last occurrence of target
        low, high = 0, n - 1
        ub = -1
        while low <= high:
            mid = low + (high - low) // 2
            if nums[mid] <= target:  # Move right
                low = mid + 1
            else:
                high = mid - 1
            if nums[mid] == target:
                ub = mid  # Store the rightmost index

        return [lb, ub] if lb != -1 else [-1, -1]  # If lb remains -1, target not found






        


        
        

        