class Solution:
    def longestMountain(self, arr: List[int]) -> int:

        n = len(arr)
        if n <3:
            return 0
        prefix = [1,] * n 
        suffix = [1,] * n 

        
        for i in range(1,n):
            if arr[i] > arr[i-1]:
                prefix[i] = 1 + prefix[i-1]

        for i in range(n-2,-1,-1):
            if arr[i] > arr[i+1]:
                suffix[i] = 1 + suffix[i+1]

        m = 0

        for i in range(n):
            if prefix[i] > 1 and suffix[i] > 1:
                m = max(m,prefix[i]+suffix[i]-1)
        return m


        


        
        