class Solution:
    def search(self, nums: List[int], target: int) -> int:

        n = len(nums)-1

        low , high = 0 , n-1

        while low<=high:

            mid = (low+high)//2

            if nums[mid] == target:
                return mid
            # left half is sorted
            if nums[low] < nums[mid]:
                if nums[low] <= target and target <= nums[mid]:
                    high = mid -1
                else:
                    low = mid +1

            #right half is sorted
            else:
                if nums[mid] <= target and target <= nums[high]:
                    low + mid+1
                else:
                    high = mid -1
        return -1




        