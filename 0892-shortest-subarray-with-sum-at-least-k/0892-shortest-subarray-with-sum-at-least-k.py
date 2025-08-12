class Solution:
    def shortestSubarray(self, nums: List[int], k: int) -> int:
        """
            range = 10 - 10^5
            nums can contain -ve
            k cant be negative
            array guranteed to be non empty.


            nums = [ 2 , -1 , 2] , k = 3

            prefix = [ 0 , 2 , 1 , 3 ]

            q = [0 , ]

            i => 0 to n+1
                
                while d and prefix[i] - prefix[q[0]] >= k:
                    ans = min(ns , i - dp.popleft())
                
                while q and prefix[i] <= prefix[q[-1]]:
                    q.pop()

                q.append(i)

                


        """
        n = len(nums)

        prefix = [0] * (n+1)

        for idx in range(n):
            prefix[idx+1] = prefix[idx] + nums[idx]

        ans = n+1
        dq = deque()

        for idx in range(n+1):
            while dq and prefix[idx] - prefix[dq[0]] >= k:
                ans = min(ans , idx-dq.popleft()) 

            while dq and prefix[idx] <= prefix[dq[-1]]:
                dq.pop()

            dq.append(idx)
        return ans if ans <= n else -1       