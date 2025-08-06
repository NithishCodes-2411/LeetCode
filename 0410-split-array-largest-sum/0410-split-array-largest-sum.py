class Solution:
    def splitArray(self, nums: List[int], k: int) -> int:


        """
        Step 1 => run a binary search between max(nums) and sum(nums)
                Step 1 => Find the mid and check if you can split nums into at most k subarrays 
                            where each sub array sum is <= mind using gredy approach.

                step 2 => if yes we will try to move left to find with a smaller mif 
                            else move right .

        """

        def can_split(max_sum):

                count = 1
                curr_sum = 0

                for num in nums:
                    if curr_sum + num > max_sum:
                        count += 1
                        curr_sum = num # new subarray 

                        if count > k:
                            return False
                    else:
                        curr_sum += num
                return True 


        left , right = max(nums) , sum(nums)

        while left < right :
            mid = (left + right) //2

            if can_split(mid):
                right = mid 
            else:
                left = mid + 1
        return left