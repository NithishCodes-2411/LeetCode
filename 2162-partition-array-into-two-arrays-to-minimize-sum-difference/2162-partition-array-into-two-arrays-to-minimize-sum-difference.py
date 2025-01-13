class Solution(object):
    def minimumDifference(self, nums):
        from itertools import combinations
        
        n = len(nums)
        half = n // 2
        ts = sum(nums)
        min_diff = float("inf")
        
        # Generate all subsets of size <= half for the first half of the array
        left_sums = {i: [] for i in range(half + 1)}
        for size in range(half + 1):
            for comb in combinations(nums[:half], size):
                left_sums[size].append(sum(comb))
        
        # Generate all subsets of size <= half for the second half of the array
        right_sums = {i: [] for i in range(half + 1)}
        for size in range(half + 1):
            for comb in combinations(nums[half:], size):
                right_sums[size].append(sum(comb))
        
        # Sort the right half sums for binary search
        for size in range(half + 1):
            right_sums[size].sort()
        
        # Find the minimum difference using two pointers or binary search
        for size in range(half + 1):
            for left_sum in left_sums[size]:
                target = (ts // 2) - left_sum
                right_list = right_sums[half - size]
                
                
                lo, hi = 0, len(right_list) - 1
                while lo <= hi:
                    mid = (lo + hi) // 2
                    if right_list[mid] < target:
                        lo = mid + 1
                    else:
                        hi = mid - 1
                
                # Check the closest elements
                for idx in [hi, lo]:
                    if 0 <= idx < len(right_list):
                        right_sum = right_list[idx]
                        min_diff = min(min_diff, abs(ts - 2 * (left_sum + right_sum)))
        
        return min_diff
