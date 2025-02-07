from typing import List

class Solution:
    def search(self, nums: List[int], target: int) -> int:

        return target in nums
        # low, high = 0, len(nums) - 1

        # if len(nums) == 1:
        #     return target in nums

        # while low <= high:
        #     mid = (low + high) // 2

        #     if nums[mid] == target:
        #         return True
        #     if nums[low] == nums[mid] == nums[high]:
        #         low = low +1
        #         high = high -1
        #     # Left half is sorted
        #     if nums[low] <= nums[mid]:  
        #         if nums[low] <= target < nums[mid]:  
        #             high = mid - 1
        #         else:
        #             low = mid + 1

        #     # Right half is sorted
        #     else:
        #         if nums[mid] < target <= nums[high]:  
        #             low = mid + 1
        #         else:
        #             high = mid - 1

        # return False
