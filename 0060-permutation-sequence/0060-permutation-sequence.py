class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        fact = [1] * (n+1)
        for idx in range(1,n+1):
            fact[idx] = fact[idx-1] * idx
        
        nums = [ str(i) for i in range(1,n+1)]

        k = k-1

        result = []

        for i in range(n,0,-1):
            idx = k // fact[i-1]
            result.append(nums[idx])
            nums.pop(idx)
            k = k % fact[i-1]
        return "".join(result)
        