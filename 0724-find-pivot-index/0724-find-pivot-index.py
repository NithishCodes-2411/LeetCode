class Solution:
    def pivotIndex(self, nums: List[int]) -> int:

        ts = 0
        for n in nums:
            ts+=n
        print(ts)
        prefix = 0

        for i in range(len(nums)):

            if prefix == ts-( prefix+nums[i] ):
                return i
            prefix = prefix+nums[i]
        return -1

        